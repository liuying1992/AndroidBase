package com.liuying.androidbase.utils;

import io.reactivex.Flowable;

/**
 * Created by liuying on 2018/7/18 14:10.
 * Email: ly1203575492@163.com
 */
public class UploadUtil {
  public static UploadUtil mUploadUtil;
  public Flowable mFlowable;

  public UploadUtil() {

  }

  public static UploadUtil getInstance() {
    synchronized (UploadUtil.class) {
      if (mUploadUtil == null) {
        mUploadUtil = new UploadUtil();
      }
      return mUploadUtil;
    }
  }
}
