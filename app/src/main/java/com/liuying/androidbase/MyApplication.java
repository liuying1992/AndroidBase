package com.liuying.androidbase;

import android.app.Application;

/**
 * Created by liuying on 2018/7/11 17:09.
 * Email: ly1203575492@163.com
 */
public class MyApplication extends Application {
  private static MyApplication sMyApplication;

  @Override public void onCreate() {
    super.onCreate();
    sMyApplication = this;
  }

  public static MyApplication getInstance() {
    return sMyApplication;
  }
}
