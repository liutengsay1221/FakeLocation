package com.lt.fakelocation;

import android.app.Application;


/**
 * @author liuteng
 * @version [2017/6/29 14:06]
 */

public class AppDroid extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
    }
}
