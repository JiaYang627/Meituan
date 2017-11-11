package com.jiayang.meituan;

import android.app.Application;

/**
 * Created by 张 奎 on 2017-11-11 10:20.
 */

public class MTApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
    }
}
