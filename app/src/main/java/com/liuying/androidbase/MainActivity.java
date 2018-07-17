package com.liuying.androidbase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.github.mzule.activityrouter.router.Routers;
import com.liuying.androidbase.http.BaseSubscription;
import com.liuying.androidbase.http.Method;
import com.liuying.androidbase.http.RequestManager;
import com.liuying.androidbase.http.RequestObject;
import com.liuying.androidbase.pojo.HttpObject;
import com.liuying.androidbase.pojo.NewPojo;
import com.liuying.androidbase.utils.L;

/***
 *  工具类
 */
public class MainActivity extends BaseActivity {

  //@BindView(R.id.lottie_view) LottieAnimationView mLottieView;
  @BindView(R.id.btn) Button mBtn;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    mBtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Routers.open(MainActivity.this, "ly://www.ly.com/activity/router_demo");
      }
    });
    //mBtn.performClick();

    RequestObject requestObject = new RequestObject();
    RequestManager.getInstance()
        .makeRequest(requestObject, "https://www.apiopen.top/journalismApi", Method.GET, false,
            NewPojo.DataBean.class)
        .subscribe(new BaseSubscription<HttpObject>() {
          @Override public void onNext(HttpObject httpObject) {
            NewPojo.DataBean mData = (NewPojo.DataBean) httpObject.getData();
          }

          @Override public void onError(Throwable t) {
            L.e(t.toString());
          }
        });
  }

  @Override public void OnMenuRightClick(View view) {
    super.OnMenuRightClick(view);
    Toast.makeText(this, "搜索", Toast.LENGTH_SHORT).show();
  }
}
