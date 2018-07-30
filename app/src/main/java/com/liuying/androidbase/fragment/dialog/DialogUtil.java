package com.liuying.androidbase.fragment.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.liuying.androidbase.R;

/**
 * 弹窗
 * Created by liuying on 2018/7/18 10:07.
 * Email: ly1203575492@163.com
 */

public class DialogUtil extends DialogFragment {
  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setStyle(DialogFragment.STYLE_NO_TITLE, R.style.BottomDialog);
  }

  @Nullable @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    //getDialog().setCanceledOnTouchOutside(false);
    //添加这句话后 dialog背景变成透明
    //getDialog().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    //  getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {
    //    @Override public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
    //      return true;
    //    }
    //  });

    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override public void onStart() {
    super.onStart();
    if (getDialog() != null) {
      getDialog().getWindow().setLayout(-1, -2);
    }
  }

  @NonNull @Override public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    View view = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_progress, null);
    builder.setView(view);
    //builder.setTitle("warring")
    //    .setMessage("this is a warring message !!!")
    //    .setPositiveButton("confirm", new DialogInterface.OnClickListener() {
    //      @Override public void onClick(DialogInterface dialogInterface, int i) {
    //
    //      }
    //    })
    //    .setNegativeButton("cancle", new DialogInterface.OnClickListener() {
    //      @Override public void onClick(DialogInterface dialogInterface, int i) {
    //
    //      }
    //    })
    //    .setCancelable(false);

    return builder.create();
  }
}
