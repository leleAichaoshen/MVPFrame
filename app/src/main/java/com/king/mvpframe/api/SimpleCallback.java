package com.king.mvpframe.api;


import com.king.mvpframe.base.BaseView;

import io.reactivex.disposables.Disposable;
import lombok.Data;

/**
 * 简单的API回调接口实现，满足常规需求。当此实现不满足时，可使用{@link SimpleTagCallback}或自定义接口实现{@link ApiCallback}
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Data
public abstract class SimpleCallback<T> implements ApiCallback<T> {

    private int code;
    private String msg;
    private T t;

    private BaseView mView;

    public SimpleCallback(BaseView iview){
        this.mView = iview;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onError(Throwable e) {
        mView.onError(e);
    }

    @Override
    public void onCompleted() {
        mView.onCompleted();
    }

}
