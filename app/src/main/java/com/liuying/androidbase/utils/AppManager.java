package com.liuying.androidbase.utils;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Stack;

/**
 * @author wjh
 * @Description:Activity管理类
 */
public class AppManager {
  private static Stack<Activity> sActivityStack;
  private static AppManager sInstance;

  private AppManager() {
    sActivityStack = new Stack<Activity>();
  }

  /**
   * 单一实例
   */
  public static AppManager getAppManager() {
    if (sInstance == null) {
      sInstance = new AppManager();
    }
    return sInstance;
  }

  public void finishActivityWithCount(int count, boolean isFinishCurrent) {
    for (int i = 0; i < count; i++) {
      int index = sActivityStack.size() - 1 - (isFinishCurrent ? 0 : 1);
      Activity activity = null;

      try {
        activity = sActivityStack.get(index);
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
      if (null != activity) {
        sActivityStack.remove(activity);
        activity.finish();
      }
    }
  }

  /**
   * 添加Activity到堆栈
   */
  public void addActivity(Activity activity) {
    sActivityStack.add(activity);
  }

  public Activity getPreviousActivity() {
    return sActivityStack.elementAt(sActivityStack.size() - 2);
  }

  public Stack<Activity> getActivityStack(){
    return sActivityStack;
  }

  /**
   * 获取当前Activity（堆栈中最后一个压入的）
   */
  public Activity currentActivity() {
    try {
      return sActivityStack.lastElement();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  /**
   * 结束当前Activity（堆栈中最后一个压入的）
   */
  public void finishActivity() {
    Activity activity = sActivityStack.lastElement();
    finishActivity(activity);
  }

  /**
   * 结束指定的Activity
   */
  public void finishActivity(Activity activity) {
    //		//应用即将全部关闭，清理缓存
    //		if(sActivityStack.size()==1){
    //			((AppContext)activity.getApplication()).clearWebViewCache();
    //
    //		}
    if (activity != null) {
      sActivityStack.remove(activity);
      activity.finish();
    }
  }

  public void removeFromStack(Activity activity) {
    if (activity != null) {
      sActivityStack.remove(activity);
    }
  }

  /**
   * 结束指定类名的Activity
   */
  public void finishActivity(Class<?> cls) {

    finishActivity(getActivity(cls));
  }

  /**
   * 结束指定类名的Activity
   */
  public void finishActivity(Class<?> cls, Intent resultIntent) {
    Activity activity = getActivity(cls);
    if (activity != null) {
      activity.setResult(Activity.RESULT_OK, resultIntent);
      finishActivity(activity);
    }
  }

  //获取指定类名的Activity
  public Activity getActivity(Class<?> cls) {
    for (Activity activity : sActivityStack) {
      if (activity.getClass().equals(cls)) {
        return activity;
      }
    }
    return null;
  }

  /**
   * 结束所有Activity
   */
  public void finishAllActivity() {
    for (int i = 0, size = sActivityStack.size(); i < size; i++) {
      if (null != sActivityStack.get(i)) {
        sActivityStack.get(i).finish();
      }
    }
    sActivityStack.clear();
  }

  /**
   * 退出应用程序
   */
  public void appExit(Context context) {
    try {
      finishAllActivity();
      System.exit(0);
    } catch (Exception e) {
    }
  }

  /**
   * 重启APP
   *
   * @param bootClass 启动的类（通常是SplashActivity）
   */
  public void appReboot(Class bootClass) {
    Context context = currentActivity();
    Intent mStartActivity = new Intent(context, bootClass);
    int mPendingIntentId = 123456;
    PendingIntent mPendingIntent =
        PendingIntent.getActivity(context, mPendingIntentId, mStartActivity,
            PendingIntent.FLAG_CANCEL_CURRENT);
    AlarmManager mgr = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
    mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 1000, mPendingIntent);
    finishAllActivity();
    //        System.exit(0);
    android.os.Process.killProcess(android.os.Process.myPid());
  }
}