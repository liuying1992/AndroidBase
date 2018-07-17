package com.liuying.androidbase;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.liuying.androidbase.utils.AppManager;

/**
 * 基础类
 *
 * Created by liuying on 2018/7/17 16:33.
 * Email: ly1203575492@163.com
 */
public class BaseActivity extends AppCompatActivity {
  private Toolbar toolbar;

  @Override public void onCreate(@Nullable Bundle savedInstanceState,
      @Nullable PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    AppManager.getAppManager().addActivity(this);
  }

  @Override protected void onStart() {
    super.onStart();
  }

  @Override protected void onResume() {
    super.onResume();
  }

  @Override protected void onPause() {
    super.onPause();
  }

  @Override protected void onStop() {
    super.onStop();
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    AppManager.getAppManager().removeFromStack(this);
  }

  @Override public void setContentView(View view) {
    super.setContentView(view);
    toolbar = findViewById(R.id.tool_bar);
    if (toolbar != null) {
      toolbar.setTitle("");
      setSupportActionBar(toolbar);
    }
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
  }

  public void OnMenuLeftClick(View view) {

  }

  public void OnMenuRightClick(View view) {

  }

  @Override public void startActivityForResult(Intent intent, int requestCode) {
    super.startActivityForResult(intent, requestCode);
    slideInFromLeft();
  }

  @Override public void finish() {
    super.finish();
    slideOutFromRight();
  }

  private void slideOutFromRight() {
    this.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
  }

  public void slideInFromLeft() {
    this.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
  }
}
