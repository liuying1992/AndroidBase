package com.liuying.androidbase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 基础fragment
 *
 * Created by liuying on 2018/7/17 16:34.
 * Email: ly1203575492@163.com
 */

public class BaseFragment extends Fragment {
  @Nullable @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
  }
}
