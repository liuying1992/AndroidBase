package com.liuying.androidbase.http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/**
 * Created by liuying
 */
public class RequestObject {
  private String action;
  private boolean isNeedRawJson;
  private List<BasicNameValuePair> params;
  private List<BasicNameValuePair> fileParams;
  private HashMap<String, String> paramsMap;
  //private ProgressRequestBody.ProgressListener mProgressListener;
  private Object tag;

  public RequestObject() {
    params = new ArrayList<BasicNameValuePair>();
    paramsMap = new HashMap<String, String>();
    fileParams = new ArrayList<BasicNameValuePair>();
  }

  public Object getTag() {
    return tag;
  }
  
  public boolean isNeedRawJson() {
    return isNeedRawJson;
  }

  public void setNeedRawJson(boolean needRawJson) {
    isNeedRawJson = needRawJson;
  }

  public void setTag(Object tag) {
    this.tag = tag;
  }

  public List<BasicNameValuePair> getParams() {
    return params;
  }

  public List<BasicNameValuePair> getFileParams() {
    return fileParams;
  }

  public static String toFirstLetterUpperCase(String str) {
    if (str == null || str.length() < 2) {
      return str;
    }
    String firstLetter = str.substring(0, 1).toUpperCase();
    return firstLetter + str.substring(1, str.length());
  }

  public void addParam(String key, String value) {
    if (value == null || "null".equals(value)) {
      return;
    }
    params.add(new BasicNameValuePair(key, value));
    paramsMap.put(key, value);
  }

  public void addParam(String key, List values) {
    for (int i = 0; i < values.size(); i++) {
      addParam(key, String.valueOf(values.get(i)));
    }
  }

  public void addFileParam(String key, String value) {
    fileParams.add(new BasicNameValuePair(key, value));
  }

  public void addFileParam(String key, List values) {
    for (int i = 0; i < values.size(); i++) {
      addFileParam(key, String.valueOf(values.get(i)));
    }
  }

  public void setParamsMap(HashMap<String, String> paramsMap) {
    this.paramsMap = paramsMap;
  }

  public HashMap<String, String> getParamsMap() {
    return paramsMap;
  }

  public String findValueByKey(String key) {
    return paramsMap.get(key);
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  /**
   * 方便构建
   */
  public static class Builder {

    private RequestObject mRequestObject;

    public Builder() {
      mRequestObject = new RequestObject();
    }

    public Builder setAction(String action) {
      mRequestObject.setAction(action);
      return this;
    }

    public Builder setNeedRawJson(boolean isNeesRawJson) {
      mRequestObject.setNeedRawJson(isNeesRawJson);
      return this;
    }

    public Builder addParam(String key, String value) {
      mRequestObject.addParam(key, value);
      return this;
    }

    public Builder addParam(String key, List values) {
      mRequestObject.addParam(key, values);
      return this;
    }

    public Builder addFileParam(String key, String value) {
      mRequestObject.addFileParam(key, value);
      return this;
    }

    public RequestObject create() {
      return mRequestObject;
    }
  }
}
