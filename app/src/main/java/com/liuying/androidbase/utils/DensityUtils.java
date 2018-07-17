package com.liuying.androidbase.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

/**
 * 常用单位转换的辅助类
 */
public class DensityUtils {
  private static int screenWidth = 0;
  private static int screenHeight = 0;

  private DensityUtils() {
    /* cannot be instantiated */
    throw new UnsupportedOperationException("cannot be instantiated");
  }

  /**
   * dp转px
   */
  public static int dp2px(Context context, float dpVal) {
    return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal,
        context.getResources().getDisplayMetrics());
  }

  /**
   * sp转px
   */
  public static int sp2px(Context context, float spVal) {
    return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal,
        context.getResources().getDisplayMetrics());
  }

  /**
   * px转dp
   */
  public static float px2dp(Context context, float pxVal) {
    final float scale = context.getResources().getDisplayMetrics().density;
    return (pxVal / scale);
  }

  /**
   * px转sp
   */
  public static float px2sp(Context context, float pxVal) {
    return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
  }

  public static int getScreenHeight(Context c) {
    if (screenHeight == 0) {
      WindowManager wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
      Display display = wm.getDefaultDisplay();
      Point size = new Point();
      display.getSize(size);
      screenHeight = size.y;
    }

    return screenHeight;
  }

  public static int getScreenWidth(Context c) {
    if (screenWidth == 0) {
      WindowManager wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
      Display display = wm.getDefaultDisplay();
      Point size = new Point();
      display.getSize(size);
      screenWidth = size.x;
    }

    return screenWidth;
  }

  public static int getStatusBarHeight(Context mContext) {
    int sbar = 0;
    try {
      Class<?> c = Class.forName("com.android.internal.R$dimen");
      sbar = mContext.getResources()
          .getDimensionPixelSize(
              Integer.parseInt(c.getField("status_bar_height").get(c.newInstance()).toString()));
    } catch (Exception e1) {
      e1.printStackTrace();
    }
    return sbar;
  }

  public static boolean hasNavBar(Context context) {
    boolean hasNavigationBar = false;
    Resources rs = context.getResources();
    int id = rs.getIdentifier("config_showNavigationBar", "bool", "android");
    if (id > 0) {
      hasNavigationBar = rs.getBoolean(id);
    }
    try {
      Class systemPropertiesClass = Class.forName("android.os.SystemProperties");
      Method m = systemPropertiesClass.getMethod("get", String.class);
      String navBarOverride = (String) m.invoke(systemPropertiesClass, "qemu.hw.mainkeys");
      if ("1".equals(navBarOverride)) {
        hasNavigationBar = false;
      } else if ("0".equals(navBarOverride)) {
        hasNavigationBar = true;
      }
    } catch (Exception e) {

    }
    return hasNavigationBar;
  }

  public static int getNavigationBarHeight(Context context) {
    int result = 0;
    if (hasNavBar(context)) {
      Resources res = context.getResources();
      int resourceId = res.getIdentifier("navigation_bar_height", "dimen", "android");
      if (resourceId > 0) {
        result = res.getDimensionPixelSize(resourceId);
      }
    }
    return result;
  }

  public static boolean isLandscape(Context context) {
    return context.getApplicationContext().getResources().getConfiguration().orientation == 2;
  }

  public static boolean isPortrait(Context context) {
    return context.getApplicationContext().getResources().getConfiguration().orientation == 1;
  }

  public static void setLandscape(Activity activity) {
    activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
  }

  public static void setPortrait(Activity activity) {
    activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
  }

  public static boolean isFullScreen(Activity activity) {
    if ((activity.getWindow().getAttributes().flags & 1024) == 1024) {
      return true;
    }
    return false;
  }
}
