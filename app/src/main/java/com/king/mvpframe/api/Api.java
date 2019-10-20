package com.king.mvpframe.api;


import com.king.mvpframe.entity.VipUser;
import com.king.mvpframe.entity.dto.UserDTO;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

public class Api {

    private ApiService mApiService;

    private volatile static Api sInstance;

    public static Api getInstance(){
        if(sInstance == null){
            synchronized (Api.class){
                if(sInstance == null){
                    sInstance = new Api();
                }
            }
        }
        return sInstance;
    }

    private Api(){
        mApiService = ApiManager.getInstance().getApiService(ApiService.class);
    }

    /**
     * 获取推荐诗词
     * @param callback
     */
    public void getRecommendPoetry(UserDTO dto, SimpleCallback<VipUser> callback){
        ApiObserver.subscribe(mApiService.login(dto),callback);
    }

}
