package com.liuying.androidbase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.airbnb.lottie.LottieAnimationView;
import com.liuying.androidbase.http.RequestManager;
import com.liuying.androidbase.http.RequestObject;
import com.liuying.androidbase.pojo.HttpObject;
import com.liuying.androidbase.pojo.NewPojo;
import com.liuying.androidbase.utils.BaseSubscription;
import com.liuying.androidbase.utils.L;
import com.liuying.androidbase.utils.Method;
import com.liuying.androidbase.utils.RxJavaUtil;

/***
 *  工具类
 */
public class MainActivity extends AppCompatActivity {

  @BindView(R.id.lottie_view) LottieAnimationView mLottieView;
  @BindView(R.id.btn) Button mBtn;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    mBtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        //Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
        RxJavaUtil.FlowableGet();
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
    });
    mBtn.performClick();
  }
}
