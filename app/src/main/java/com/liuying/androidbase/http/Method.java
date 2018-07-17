package com.liuying.androidbase.http;

import android.support.annotation.IntDef;

/**
 * Created by liuying on 2018/7/12 15:02.
 * Email: ly1203575492@163.com
 */
public class Method {
  public static final int GET = 0;
  public static final int POST = 1;
  public static final int PUT = 2;
  public static final int DELETE = 3;
  public static final int MULTI_PART = 4;

  @IntDef({ GET, POST, PUT, DELETE, MULTI_PART }) public @interface RequestMethod {
  }
}
