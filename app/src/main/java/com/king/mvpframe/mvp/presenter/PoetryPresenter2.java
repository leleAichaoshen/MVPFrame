package com.king.mvpframe.mvp.presenter;

import com.king.mvpframe.api.Api;
import com.king.mvpframe.api.SimpleCallback;
import com.king.mvpframe.base.BasePresenter;
import com.king.mvpframe.entity.VipUser;
import com.king.mvpframe.entity.dto.UserDTO;
import com.king.mvpframe.mvp.iview.PoetryView2;


/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @date 2017/7/5
 */
public class PoetryPresenter2 extends BasePresenter<PoetryView2> {


    /**
     * 获取推荐诗词
     */
    public void getRecommendPoetry(UserDTO user){
        ifViewAttached(view -> {
//            view.showProgress();
            Api.getInstance().getRecommendPoetry(user,new SimpleCallback<VipUser>(view) {
                @Override
                public void onNext(VipUser result) {
                    view.onGetRecommendPoetry(result);
                }
            });
        });

    }

}
