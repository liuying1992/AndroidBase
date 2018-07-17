package com.liuying.androidbase.utils;

import android.support.annotation.IntDef;

/**
 * Created by liuying on 2018/7/12 15:02.
 * Email: ly1203575492@163.com
 */
public class AndroidEnum {
  public static final int FIRST_ENUM = 1;
  public static final int SECOND_ENUM = 2;
  public static final int THIRD_ENUM = 3;

  @IntDef({ FIRST_ENUM, SECOND_ENUM, THIRD_ENUM }) public @interface Status {
  }
}
