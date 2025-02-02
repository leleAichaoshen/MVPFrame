package com.king.mvpframe.mvp.template;

import android.support.annotation.NonNull;

import com.king.mvpframe.R;
import com.king.mvpframe.base.activity.QuickActivity;

/**
 * Activity模板
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class TemplateActivity extends QuickActivity<TemplateView,TemplatePresenter> {
    @Override
    public int getRootViewId() {
        return R.layout.template_activity;
    }

    @Override
    public void initUI() {

    }

    @Override
    public void initData() {

    }

    @NonNull
    @Override
    public TemplatePresenter createPresenter() {
        return new TemplatePresenter();
    }
}
