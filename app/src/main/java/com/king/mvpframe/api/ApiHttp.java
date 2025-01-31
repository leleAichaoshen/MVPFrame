package com.king.mvpframe.api;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;

import com.king.mvpframe.App;
import com.king.mvpframe.util.SPUtil;
import com.king.mvpframe.util.SP_Constant;
import com.king.mvpframe.util.SSLSocketFactoryUtils;

import org.apache.http.conn.ssl.SSLSocketFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

public class ApiHttp {

    /**
     *  默认超时时间 单位/秒
     */
    public static final int DEFAULT_TIME_OUT = 15;

    private int mTimeout;

    private String mBaseUrl;

    private OkHttpClient mOkHttpClient;

    private Retrofit mRetrofit;

    private Map<String,Object> mRetrofitServiceCache;


    /**
     * 构造
     * @param baseUrl
     */
    public ApiHttp(String baseUrl){
        this(baseUrl,DEFAULT_TIME_OUT);
    }

    /**
     * 构造
     * @param baseUrl
     * @param timeout  超时时间 单位/秒，默认{@link #DEFAULT_TIME_OUT}
     */
    public ApiHttp(String baseUrl,int timeout){
        this.mBaseUrl = baseUrl;
        this.mTimeout = timeout;
    }

    /**
     * 获得{@link Retrofit}
     * @return {@link #mRetrofit}
     */
    public Retrofit getRetrofit(){
        if(mRetrofit == null){
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(mBaseUrl)

                    .addConverterFactory( GsonConverterFactory.create())
                    .addCallAdapterFactory( RxJava2CallAdapterFactory.create())
                    .client(getOkHttpClient())
                    .build();
        }
        return mRetrofit;
    }

    /**
     * 获得{@link OkHttpClient}
     * @return {@link #mOkHttpClient}
     */
    public OkHttpClient getOkHttpClient(){
        if(mOkHttpClient == null) {
            mOkHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(mTimeout, TimeUnit.SECONDS)
                    .readTimeout(mTimeout, TimeUnit.SECONDS)
                    .writeTimeout(mTimeout, TimeUnit.SECONDS)
                    .addInterceptor(new LogInterceptor())
                    .addNetworkInterceptor(headInterceptor())
                    .sslSocketFactory(SSLSocketFactoryUtils.createSSLSocketFactory(),SSLSocketFactoryUtils.createTrustAllManager())
                    .hostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER)
                    .build();
        }

        return mOkHttpClient;
    }
    /**
     * 增加头部信息
     */
    static Interceptor headInterceptor() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                Request.Builder builder = originalRequest.newBuilder();
                String token = SPUtil.getString(App.getInstance(), SP_Constant.TOKEN);
                //TODO
                if (!TextUtils.isEmpty(token)) {
                    builder.addHeader("access-token",  token);
                    Log.e("TOKEN", token);
                }
                Request request = builder.build();
                return chain.proceed(request);
            }
        };
    }
    /**
     * 对外暴露方法，提供自定义配置{@link OkHttpClient}
     * @param okHttpClient
     */
    public void setOkHttpClient(OkHttpClient okHttpClient) {
        this.mOkHttpClient = okHttpClient;
    }

    /**
     * 对外暴露方法，提供自定义配置{@link Retrofit}
     * @param retrofit
     */
    public void setRetrofit(Retrofit retrofit) {
        this.mRetrofit = retrofit;
    }

    /**
     * 传入Class 通过{@link Retrofit#create(Class)}获得对应的Class
     * @param service
     * @param <T>
     * @return
     */
    public <T> T getRetrofitService(@NonNull Class<T> service) {
        if(mRetrofitServiceCache == null){
            mRetrofitServiceCache = new HashMap<>();
        }

        T retrofitService = (T)mRetrofitServiceCache.get(service.getCanonicalName());
        if(retrofitService == null){
            synchronized (mRetrofitServiceCache) {
                if(retrofitService == null){
                    retrofitService = getRetrofit().create(service);
                    //缓存
                    mRetrofitServiceCache.put(service.getCanonicalName(),retrofitService);
                }

            }
        }

        return retrofitService;
    }

}
