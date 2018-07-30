package com.liuying.androidbase;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.Glide;
import com.liuying.androidbase.fragment.dialog.DialogUtil;
import com.liuying.androidbase.http.BaseSubscription;
import com.liuying.androidbase.http.Method;
import com.liuying.androidbase.http.RequestManager;
import com.liuying.androidbase.http.RequestObject;
import com.liuying.androidbase.pojo.HttpObject;
import com.liuying.androidbase.pojo.NewPojo;
import com.liuying.androidbase.utils.L;
import com.liuying.androidbase.view.AmountView;

/***
 *  工具类
 */
public class MainActivity extends BaseActivity {

  //@BindView(R.id.lottie_view) LottieAnimationView mLottieView;
  @BindView(R.id.btn_left) ImageView mBtnLeft;
  @BindView(R.id.btn_right) ImageView mBtnRight;
  @BindView(R.id.tool_bar) Toolbar mToolBar;
  @BindView(R.id.img_view) ImageView mImgView;
  @BindView(R.id.btn) Button mBtn;
  @BindView(R.id.scroll_view) ScrollView mScrollView;
  @BindView(R.id.amount_view) AmountView mAmountView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    mBtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        //Routers.open(MainActivity.this, "ly://www.ly.com/activity/router_demo");

        DialogUtil dialogUtil = new DialogUtil();
        //dialogUtil.setTargetFragment();
        dialogUtil.show(getSupportFragmentManager(), "tag");

        //mBtn.postDelayed(new Runnable() {
        //  @Override public void run() {
        //    dialogUtil.dismiss();
        //  }
        //}, 3000);

        loadImg();
        //ScreenshotUtil.getBitmapByView(MainActivity.this, mScrollView);
      }
    });
    //mBtn.performClick();

    mAmountView.setGoods_storage(50);
    mAmountView.setOnAmountChangeListener(new AmountView.OnAmountChangeListener() {
      @Override public void onAmountChange(View view, int amount) {
        Toast.makeText(getApplicationContext(), "Amount=>  " + amount, Toast.LENGTH_SHORT).show();
      }
    });

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

  public void loadImg() {
    //String path =
    //    "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531894935135&di=efc4b3b90268ce845426f6c0bb0de403&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01177d591bb4e3b5b3086ed4a524a3.jpg%402o.jpg";

    String path =
        "https://img.alicdn.com/bao/uploaded/i3/83928224/TB25H06tpXXXXcQXXXXXXXXXXXX_!!83928224.jpg_300x300q85s150.jpg_.webp";

    Glide.with(this).load(path).into(mImgView);
  }

  @Override public void onMessageEvent(Object object) {
    super.onMessageEvent(object);
    Toast.makeText(this, object.toString(), Toast.LENGTH_SHORT).show();
  }
}
