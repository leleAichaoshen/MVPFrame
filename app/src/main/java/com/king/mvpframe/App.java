package com.king.mvpframe;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.king.mvpframe.api.ApiManager;

import java.util.Stack;

import timber.log.Timber;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

public class App extends Application {

    private Stack<Activity> activityStack;

    public static App instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        init();
    }

    private void init(){
        ApiManager.init(Constants.BASE_URL);
        Timber.plant(new Timber.DebugTree());
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public static synchronized App getInstance() {
        return instance;
    }

    /**
     * 保存Activity的引用
     */
    public void addActivity(Activity act) {
        if (activityStack == null)
            activityStack = new Stack<>();
        activityStack.add(act);
    }

    /**
     * 关闭指定Activity的引用
     */
    public void removeActivity(Activity act) {
        if (activityStack.contains(act))
            activityStack.remove(act);
    }

    /**
     * 获取当前Activity(堆栈中的最后一个)
     */
    public Activity currentActivity() {
        Activity activity = activityStack.lastElement();
        return activity;
    }

    /**
     * 退出App
     */
    public void exitApp() {
        if (activityStack != null) {
            synchronized (activityStack) {
                for (Activity act : activityStack) {
                    act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
