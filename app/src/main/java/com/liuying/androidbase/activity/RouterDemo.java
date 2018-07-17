package com.liuying.androidbase.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.github.mzule.activityrouter.annotation.Router;
import com.liuying.androidbase.BaseActivity;
import com.liuying.androidbase.R;

/**
 * Created by liuying on 2018/7/17 17:17.
 * Email: ly1203575492@163.com
 */
@Router(value = "activity/router_demo") public class RouterDemo extends BaseActivity {
  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_router_demo);
  }
}
