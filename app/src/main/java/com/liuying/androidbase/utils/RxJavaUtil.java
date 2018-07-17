package com.liuying.androidbase.utils;

import android.util.Log;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by liuying on 2018/7/17 11:14.
 * Email: ly1203575492@163.com
 */
public class RxJavaUtil {
  public static final void FlowableGet() {
    Flowable.create(new FlowableOnSubscribe<String>() {
      @Override public void subscribe(FlowableEmitter<String> emitter) throws Exception {
        emitter.onNext("WHAT THE FUCK");
      }
    }, BackpressureStrategy.BUFFER)
        .subscribeOn(Schedulers.newThread())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new BaseSubscription<String>() {
          @Override public void onNext(String str) {
            Log.e("tags", str.toLowerCase());
          }

          @Override public void onError(Throwable t) {
            Log.e("tags", t.toString());
          }
        });

    Flowable.just("hello world").subscribe(new BaseSubscription<String>() {

      @Override public void onNext(String str) {
        Log.e("tags", str.toUpperCase());
      }

      @Override public void onError(Throwable t) {
        Log.e("tags", t.toString());
      }
    });
  }
}
