package com.liuying.androidbase;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.github.mzule.activityrouter.router.RouterCallback;
import com.github.mzule.activityrouter.router.RouterCallbackProvider;
import com.github.mzule.activityrouter.router.SimpleRouterCallback;

/**
 * Created by liuying on 2018/7/11 17:09.
 * Email: ly1203575492@163.com
 */
public class MyApplication extends Application implements RouterCallbackProvider {
  private static MyApplication sMyApplication;

  @Override public void onCreate() {
    super.onCreate();
    sMyApplication = this;
  }

  public static MyApplication getInstance() {
    return sMyApplication;
  }

  @Override public RouterCallback provideRouterCallback() {
    return new SimpleRouterCallback() {
      @Override public boolean beforeOpen(Context context, Uri uri) {
        return super.beforeOpen(context, uri);
      }

      @Override public void afterOpen(Context context, Uri uri) {
        super.afterOpen(context, uri);
      }

      @Override public void notFound(Context context, Uri uri) {
        super.notFound(context, uri);
      }

      @Override public void error(Context context, Uri uri, Throwable e) {
        super.error(context, uri, e);
      }
    };
  }
}
