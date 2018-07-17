package com.liuying.androidbase.http;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * Created by liuying on 2018/7/17 13:35.
 * Email: ly1203575492@163.com
 */
public abstract class BaseSubscription<T> implements Subscriber<T> {
  @Override public void onComplete() {

  }
  
  @Override public void onSubscribe(Subscription s) {
    s.request(Long.MAX_VALUE);
  }
}
