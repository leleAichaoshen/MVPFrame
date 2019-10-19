package com.king.mvpframe.base;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ProgressBar;

import com.king.mvpframe.R;

import io.reactivex.annotations.NonNull;


/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

public class BaseProgressDialog extends Dialog {


    public static BaseProgressDialog newInstance(Context context) {
        return new BaseProgressDialog(context);
    }


    public BaseProgressDialog(Context context) {
        this(context, R.style.mvpframe_progress_dialog);
    }

    public BaseProgressDialog(Context context, int themeResId) {
        super(context, themeResId);
        initUI();
    }

    public BaseProgressDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initUI();
    }

    @Override
    public void setContentView(@NonNull View view) {
        if(view == null){
            view = new ProgressBar(getContext());
        }
        super.setContentView(view);
    }

    private void initUI() {
        getWindow().getAttributes().gravity = Gravity.CENTER;
        setCanceledOnTouchOutside(false);
    }

}