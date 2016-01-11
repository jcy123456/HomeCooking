package com.android.homecooking.application;

import android.app.Application;

import com.lidroid.xutils.HttpUtils;

public class HomeCookApplication extends Application {

    private static HomeCookApplication application;

    private HttpUtils httpUtils;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;
    }

    public static HomeCookApplication getApp(){
        return application;
    }

    private void initHttpUtils(){
        httpUtils = new HttpUtils();
        httpUtils.configRequestThreadPoolSize(5);
        httpUtils.configSoTimeout(30 * 1000);
        httpUtils.configRequestRetryCount(3);
        httpUtils.configTimeout(60 * 1000);
        httpUtils.configResponseTextCharset("utf-8");
    }

    public HttpUtils getHttpUtils(){
        return httpUtils;
    }

}
