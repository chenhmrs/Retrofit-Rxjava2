package com.example.wellwang.servicebackdemo;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.xdandroid.hellodaemon.DaemonEnv;

/**
 * Created by Well Wang on 2018/3/5.
 */

public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DaemonEnv.initialize(
                this,  //Application Context.
                 ServiceBack.class, //刚才创建的 Service 对应的 Class 对象.
                60*1000*6);  //定时唤醒的时间间隔(ms), 默认 6 分钟.

        this.startService(new Intent(this, ServiceBack.class));
    }
}
