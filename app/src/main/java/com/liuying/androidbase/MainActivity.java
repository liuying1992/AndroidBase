package com.liuying.androidbase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.airbnb.lottie.LottieAnimationView;
import com.liuying.androidbase.utils.L;
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
      }
    });
    mBtn.performClick();
    L.json(
        "{\t\"code\":1,\t\"message\":\"成功!\",\t\"object\":{\t\t\"id\":97797,\t\t\"name\":\"梁施施\",\t\t\"mobile\":\"14200000000\",\t\t\"photoPublic\":{\t\t\t\"originalFile\":\"/PUBLIC/FACE/2018-07-04/8da9e48b-c069-4d8f-a223-2eb91912e96f.jpg\",\t\t\t\"fullPath\":\"http://cdnpubimg.cheok.com/PUBLIC/FACE/2018-07-04/8da9e48b-c069-4d8f-a223-2eb91912e96f.jpg\"\t\t},\t\t\"photo\":\"/PUBLIC/FACE/2018-07-04/8da9e48b-c069-4d8f-a223-2eb91912e96f.jpg\",\t\t\"nickname\":\"梁施施\",\t\t\"idcard\":\"666666666666666666\",\t\t\"provinceID\":5,\t\t\"provinceName\":\"广东\",\t\t\"cityID\":44,\t\t\"cityName\":\"佛山市\",\t\t\"countyID\":null,\t\t\"countyName\":\"\",\t\t\"address\":\"测试\",\t\t\"empID\":29730,\t\t\"empName\":\"王华华业务员\",\t\t\"empMobile\":\"14100000000\",\t\t\"empPhotoPublic\":{\t\t\t\"originalFile\":null,\t\t\t\"fullPath\":null\t\t},\t\t\"empPhoto\":null,\t\t\"role\":3,\t\t\"isInitPayPwd\":1,\t\t\"roleID\":4,\t\t\"authStatus\":2,\t\t\"isModify\":1,\t\t\"bankBindStatus\":null,\t\t\"isRealName\":1,\t\t\"realName\":\"梁施施\",\t\t\"realIdCard\":\"666666666666666666\",\t\t\"deviceToken\":\"0b449c68245aed0ba4324618c94550c1\",\t\t\"isAgainAuth\":0,\t\t\"isAllowAgainAuth\":1,\t\t\"isOpenActivity\":0,\t\t\"isGreatCarEntrance\":0,\t\t\"isAssistEntrance\":0,\t\t\"pagehomeID\":55549,\t\t\"greatCarType\":null,\t\t\"storeProvinceID\":5,\t\t\"storeProvinceName\":\"广东\",\t\t\"storeCityID\":44,\t\t\"storeCityName\":\"佛山市\",\t\t\"storeCountyID\":null,\t\t\"storeCountyName\":null,\t\t\"rankID\":1\t},\t\"map\":{},\t\"handelEntity\":null}");
  }
}
