package com.liuying.androidbase.utils;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

//跟网络相关的工具类
public class NetUtils {
  private NetUtils() {
        /* cannot be instantiated */
    throw new UnsupportedOperationException("cannot be instantiated");
  }

  /**
   * 判断网络是否连接
   */
  public static boolean isConnected(Context context) {

    ConnectivityManager connMgr =
        (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
    return (networkInfo != null && networkInfo.isConnected());
  }

  /**
   * 判断是否是wifi连接
   */
  public static boolean isWifi(Context context) {
    ConnectivityManager cm =
        (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

    if (cm == null) return false;
    return cm.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_WIFI;
  }

  /**
   * 打开网络设置界面
   */
  public static void openSetting(Context context, final Activity activity) {
    // 如果网络不可用，则弹出对话框，对网络进行设置
    Builder builder = new Builder(context);
    builder.setTitle("没有可用的网络");
    builder.setMessage("是否对网络进行设置?");
    builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
      @Override public void onClick(DialogInterface dialog, int which) {
        Intent intent = null;
        try {
          if (android.os.Build.VERSION.SDK_INT > 10) {
            intent = new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS);
          } else {
            intent = new Intent();
            ComponentName comp =
                new ComponentName("com.android.settings", "com.android.settings.WirelessSettings");
            intent.setComponent(comp);
            intent.setAction("android.intent.action.VIEW");
          }
          activity.startActivity(intent);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
    builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
      @Override public void onClick(DialogInterface dialog, int which) {
        activity.finish();
      }
    });
    builder.create();
    builder.show();
  }

  public static NetworkInfo getActiveNetworkInfo(Context context) {
    try {
      return ((ConnectivityManager) context.getSystemService(
          Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
    } catch (Throwable th) {
      return null;
    }
  }
}
