package com.king.mvpframe.base.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;

import com.king.mvpframe.base.BasePresenter;
import com.king.mvpframe.base.BaseView;

/**
 * DataBinding的Activity
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public abstract class BindingActivity<V extends BaseView, P extends BasePresenter<V>,VDB extends ViewDataBinding> extends QuickActivity<V,P> {

    protected VDB mBinding;

    @Override
    public boolean isContentView(int layoutId) {
        mBinding = DataBindingUtil.setContentView(this,layoutId);
        return true;
    }
}