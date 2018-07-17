package com.liuying.androidbase.pojo;

/**
 * Created by liuying on 2018/7/17 14:58.
 * Email: ly1203575492@163.com
 */
public class HttpObject {
  private int httpCode;
  private String message;
  private Object mObject;

  // TODO: 2018/7/17
  private int code;
  private String msg;
  private Object data;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public int getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(int httpCode) {
    this.httpCode = httpCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getObject() {
    return mObject;
  }

  public void setObject(Object object) {
    mObject = object;
  }
}
