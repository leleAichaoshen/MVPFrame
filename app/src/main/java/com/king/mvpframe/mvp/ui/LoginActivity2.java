package com.king.mvpframe.mvp.ui;

import android.support.annotation.NonNull;

import com.king.base.util.StringUtils;
import com.king.base.util.ToastUtils;
import com.king.mvpframe.App;
import com.king.mvpframe.R;
import com.king.mvpframe.base.activity.BindingActivity;
import com.king.mvpframe.databinding.ActivityLoginBinding;
import com.king.mvpframe.entity.VipUser;
import com.king.mvpframe.entity.dto.UserDTO;
import com.king.mvpframe.mvp.iview.PoetryView;
import com.king.mvpframe.mvp.iview.PoetryView2;
import com.king.mvpframe.mvp.presenter.PoetryPresenter2;

public class LoginActivity2 extends BindingActivity<PoetryView2, PoetryPresenter2, ActivityLoginBinding> implements PoetryView  {

    private VipUser call;
    @Override
    public int getRootViewId() {
        return R.layout.activity_login;
    }

    @Override
    public void initUI() {
        call=new VipUser();

//        listData = new ArrayList<>();
//        mAdapter = new BindingAdapter<>(getContext(),listData,R.layout.rv_poetry_item);
//
//        mBinding.recyclerView.setAdapter(mAdapter);
//
//        mAdapter.setOnItemClickListener((v, position) -> {
//            PoetryInfo data = mAdapter.getItem(position);
//            showDialogFragment(PoetryInfoDialogFragment.newInstance(data));
//        });
//
//        mBinding.srl.setOnRefreshListener(() -> getPresenter().getRecommendPoetry());

    }

    @Override
    public void initData() {
       // mBinding.srl.setRefreshing(true);
        UserDTO userDTO=mBinding.getUser();
    }

    @NonNull
    @Override
    public PoetryPresenter2 createPresenter() {
        return new PoetryPresenter2();
    }

    /**
     * 网络请求相应发生错误的时候会调用onError，可在此方法内做相应的处理或提示
     * @param e
     */
    @Override
    public void onError(Throwable e) {
        super.onError(e);
       // mBinding.srl.setRefreshing(false);
    }

    /**
     * 网络请求相应完成后会调用onCompleted。
     */
    @Override
    public void onCompleted() {
        super.onCompleted();
       // mBinding.srl.setRefreshing(false);
    }

    @Override
    public void onGetRecommendPoetry(VipUser callback) {

    }


   public  class Handler{
        public void login(){
            UserDTO user=mBinding.getUser();
            if (StringUtils.isBlank(user.getLoginName())){
                ToastUtils.showToast(App.getInstance(),"用户名不能为空!");
            }
            if (StringUtils.isBlank(user.getLoginName())){
                ToastUtils.showToast(App.getInstance(),"用户名不能为空!");
            }
            getPresenter().getRecommendPoetry(user);
        }
    }
}
