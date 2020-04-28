package com.example.zaiko;

import android.app.Application;

import com.example.zaiko.infra.MyDatabase;

public class MyApplication extends Application {
    public MyDatabase db;
    @Override
    public void onCreate() {
        super.onCreate();
        db = MyDatabase.getInstance(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        db = null;
    }
}
