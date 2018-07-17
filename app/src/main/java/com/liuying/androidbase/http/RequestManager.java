package com.liuying.androidbase.http;

import android.text.TextUtils;
import com.liuying.androidbase.MyApplication;
import com.liuying.androidbase.pojo.HttpObject;
import com.liuying.androidbase.utils.GsonUtil;
import com.liuying.androidbase.utils.L;
import com.liuying.androidbase.utils.NetUtils;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

/**
 * 请求工具
 *
 * Created by liuying on 2018/7/17 14:54.
 * Email: ly1203575492@163.com
 */
public class RequestManager {

  public static RequestManager sRequestManager;
  private static Executor THREAD_POOL_CACHE_EXECUTOR = ThreadPool.getInstance().getExecutor();
  private final MediaType MEDIA_TYPE_JPG = MediaType.parse("image/jpeg");
  private final MediaType MEDIA_TYPE_MP3 = MediaType.parse("audio/mp3");
  private final MediaType MEDIA_TYPE_PNG = MediaType.parse("image/png");

  public static RequestManager getInstance() {
    if (sRequestManager == null) {
      sRequestManager = new RequestManager();
    }
    return sRequestManager;
  }

  public synchronized Flowable<HttpObject> makeRequest(RequestObject requestObject, String url,
      @Method.RequestMethod int method, boolean isCollection, Class clz) {
    return Flowable.create(new FlowableOnSubscribe<HttpObject>() {
      @Override public void subscribe(FlowableEmitter<HttpObject> emitter) throws Exception {
        String json = null;
        HttpObject httpObject = null;
        try {
          json = doRequest(requestObject, url, method);
        } catch (IOException ie) {
          httpObject = generateHttpErrorObject(ie.getMessage());
        }

        if (httpObject == null) {
          //httpObject = (HttpObject) GsonUtil.jsonToBean(json, HttpObject.class);

          JSONObject jsonObject = new JSONObject(json);
          httpObject = (HttpObject) GsonUtil.jsonToBean(json, HttpObject.class);
          String object = jsonObject.getString("data");

          if (!TextUtils.isEmpty(object) && clz != null) {
            if (isCollection) {
              httpObject.setData(GsonUtil.jsonToList(object, clz));
            } else {
              httpObject.setData(GsonUtil.jsonToBean(object, clz));
            }
          }
        }

        emitter.onNext(httpObject);
      }
    }, BackpressureStrategy.BUFFER)
        .subscribeOn(Schedulers.from(THREAD_POOL_CACHE_EXECUTOR))
        .observeOn(AndroidSchedulers.mainThread());
  }

  private HttpObject generateHttpErrorObject(String message) {
    HttpObject httpObject = new HttpObject();
    try {
      int httpCode = Integer.parseInt(message);
      httpObject.setHttpCode(httpCode);
      if (httpCode == 401 || httpCode == 400 || httpCode == 402 || httpCode == 461) {
        //if ((httpCode == 401 || httpCode == 402) && mOnAuthListener != null) {
        //  mOnAuthListener.onAuthNotPass(httpCode);
        //}
        //if (httpCode == 461) {
        //  mOnAuthListener.onDeviceConflict();
        //}
        httpObject.setMessage("");
      } else if (httpCode == 404) {
        httpObject.setMessage("找不到资源");
      } else if (httpCode == 408) {
        httpObject.setMessage("请求超时，请重试");
      } else if (httpCode >= 400 && httpCode < 500) {
        httpObject.setMessage("");
      } else if (httpCode >= 500 && httpCode <= 600) {
        httpObject.setMessage("服务器异常");
      }
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      httpObject.setHttpCode(0);
      httpObject.setHttpCode(-1);
      if (message != null) {
        httpObject.setMessage(message);
      } else {
        httpObject.setMessage("当前网络不可用，请检查网络");
      }
    }
    return httpObject;
  }

  private String doRequest(RequestObject requestObject, String url,
      @Method.RequestMethod int method) throws IOException {
    return doRequest(requestObject.getParams(), requestObject.getFileParams(), url, method);
  }

  private String doRequest(List<BasicNameValuePair> params, List<BasicNameValuePair> fileParams,
      String url, int method) throws IOException {
    switch (method) {
      case Method.GET:
        return doGet(url, params);
      case Method.POST:
        return doPost(url, params);
      case Method.DELETE:
        return doDelete(url, params);
      case Method.PUT:
        return doPut(url, params);
      case Method.MULTI_PART:
        return doMultiPartPost(url, params, fileParams);
      default:
        return null;
    }
  }

  public String doGet(String url, List<BasicNameValuePair> params) throws IOException {
    Request.Builder requestBuilder = new Request.Builder();
    requestBuilder.url(HttpParamsUtil.attachHttpGetParams(url, params));
    Response response = execute(requestBuilder.build());
    L.i("response.cacheResponse():" + response.cacheResponse());
    if (response.isSuccessful()) {
      String result = response.body().string();
      L.json(result);
      return result;
    } else {
      L.e("Unexpected code " + response);
      throw new IOException(response.code() + "");
    }
  }

  /**
   * 该不会开启异步线程。
   *
   * @throws IOException
   */
  public Response execute(Request request) throws IOException {
    //优化请求策略
    int retryCount = 3;
    while (retryCount > 0) {
      long beginTime = System.currentTimeMillis();
      try {
        return HttpUtil.getOkHttpClient().newCall(request).execute();
      } catch (IOException e) {
        e.printStackTrace();
        if (e instanceof SocketTimeoutException) {
          throw new IOException("连接超时");
        }
      }

      retryCount--;
    }
    if (NetUtils.isConnected(MyApplication.getInstance())) {
      throw new IOException("连接异常，请重试");
    } else {
      throw new IOException("当前网络不可用，请检查网络");
    }
  }

  public String doDelete(String url, List<BasicNameValuePair> params) throws IOException {
    Request.Builder requestBuilder = new Request.Builder();
    requestBuilder.url(HttpParamsUtil.attachHttpGetParams(url, params)).delete();

    Response response = execute(requestBuilder.build());
    if (response.isSuccessful()) {
      String result = response.body().string();
      L.json(result);
      return result;
    } else {
      L.e("Unexpected code " + response);
      throw new IOException(response.code() + "");
    }
  }

  public String doPut(String url, List<BasicNameValuePair> params) throws IOException {

    Request.Builder requestBuilder = new Request.Builder();
    requestBuilder.url(url).put(valuePairToParamBody(params));
    Response response = execute(requestBuilder.build());
    if (response.isSuccessful()) {
      String result = response.body().string();
      L.json(result);
      return result;
    } else {
      L.e("Unexpected code " + response);
      throw new IOException(response.code() + "");
    }
  }

  public String doPost(String url, List<BasicNameValuePair> params) throws IOException {
    Request.Builder requestBuilder = new Request.Builder();
    requestBuilder.url(url).post(valuePairToParamBody(params));
    Response response = execute(requestBuilder.build());
    if (response.isSuccessful()) {
      String result = response.body().string();
      L.json(result);
      return result;
    } else {
      L.e("Unexpected code " + response);
      throw new IOException(response.code() + "");
    }
  }

  private RequestBody valuePairToParamBody(List<BasicNameValuePair> params) {
    FormBody.Builder formEncodingBuilder = new FormBody.Builder();
    if (params == null || params.size() == 0) {
      return formEncodingBuilder.build();
    }
    for (BasicNameValuePair nameValuePair : params) {
      if (nameValuePair.getValue() != null) {
        formEncodingBuilder.add(nameValuePair.getName(), nameValuePair.getValue());
      }
    }
    return formEncodingBuilder.build();
  }

  public String doMultiPartPost(String url, List<BasicNameValuePair> params,
      List<BasicNameValuePair> fileParams) throws IOException {
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    for (BasicNameValuePair nameValuePair : fileParams) {
      File file = new File(nameValuePair.getValue());
      if (nameValuePair.getValue().contains(".mp3")) {
        multipartBuilder.addFormDataPart(nameValuePair.getName(), file.getName(),
            createRequestBody(MEDIA_TYPE_MP3, file));
      } else if (nameValuePair.getValue().contains(".png")) {
        multipartBuilder.addFormDataPart(nameValuePair.getName(), file.getName(),
            createRequestBody(MEDIA_TYPE_PNG, file));
      } else {
        multipartBuilder.addFormDataPart(nameValuePair.getName(), file.getName(),
            createRequestBody(MEDIA_TYPE_JPG, file));
      }
    }
    for (BasicNameValuePair nameValuePair : params) {
      multipartBuilder.addFormDataPart(nameValuePair.getName(), nameValuePair.getValue());
    }

    Request.Builder requestBuilder = new Request.Builder();
    requestBuilder.url(url).post(multipartBuilder.build());
    Response response = execute(requestBuilder.build());
    if (response.isSuccessful()) {
      String result = response.body().string();
      L.json(result);
      return result;
    } else {
      L.e("Unexpected code " + response);
      throw new IOException(response.code() + "");
    }
  }

  private RequestBody createRequestBody(MediaType mediaType, File file) {
    return RequestBody.create(mediaType, file);
  }
}
