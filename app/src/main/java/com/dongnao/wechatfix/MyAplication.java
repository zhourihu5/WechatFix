package com.dongnao.wechatfix;

import android.app.Application;
import android.content.Context;

/**
 * Created by baby on 2018/1/24.
 */

public class MyAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        FixManager.getInstance().loadDex(base);
        super.attachBaseContext(base);

    }
}
