package com.liuying.androidbase.http;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by liuying on 2018/7/17 14:13.
 * Email: ly1203575492@163.com
 */
public class HttpUtil {
  private static OkHttpClient mOkHttpClient;

  public static OkHttpClient getOkHttpClient() {
    mOkHttpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
      @Override public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
            .newBuilder()
            .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
            .addHeader("Accept-Encoding", "gzip, deflate")
            .addHeader("Connection", "keep-alive")
            .addHeader("Accept", "*/*")
            .addHeader("Cookie", "add cookies here")
            .build();
        return chain.proceed(request);
      }
    })
        //.sslSocketFactory() //添加SSL证书
        .build();
    return mOkHttpClient;
  }
}
