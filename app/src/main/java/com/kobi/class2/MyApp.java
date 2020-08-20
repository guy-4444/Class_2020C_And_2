package com.kobi.class2;

import android.app.Application;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MySignalV2.initHelper(this);

        MySPV3.initHelper(this);

    }
}
