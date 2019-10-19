package com.king.mvpframe.mvp.template;

import com.king.mvpframe.R;
import com.king.mvpframe.base.LazyFragment;

/**
 * LazyFragment模板
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class TemplateLazyFragment extends LazyFragment<TemplateView,TemplatePresenter> {

    @Override
    public int getRootViewId() {
        return R.layout.template_lazy_fragment;
    }

    @Override
    public void onLazyLoad() {

    }


    @Override
    public TemplatePresenter createPresenter() {
        return new TemplatePresenter();
    }
}
