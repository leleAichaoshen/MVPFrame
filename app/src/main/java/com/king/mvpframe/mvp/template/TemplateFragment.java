package com.king.mvpframe.mvp.template;

import com.king.mvpframe.R;
import com.king.mvpframe.base.fragment.QuickFragment;

/**
 * Fragment模板
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class TemplateFragment  extends QuickFragment<TemplateView,TemplatePresenter> {
    @Override
    public int getRootViewId() {
        return R.layout.template_fragment;
    }

    @Override
    public void initUI() {

    }

    @Override
    public void initData() {

    }

    @Override
    public TemplatePresenter createPresenter() {
        return new TemplatePresenter();
    }
}
