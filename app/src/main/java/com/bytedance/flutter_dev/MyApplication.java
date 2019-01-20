package com.bytedance.flutter_dev;

import android.app.Application;
import android.util.Log;

import java.io.File;

import io.flutter.view.FlutterMain;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlutterMain.startInitialization(this);

        Log.d(MyApplication.this.getClass().getSimpleName(), FlutterMain.class.getCanonicalName());

        String classpath = System.getProperty("java.class.path");
        String[] classpathEntries = classpath.split(File.pathSeparator);

        for (String classpathEntry : classpathEntries) {
            Log.d(MyApplication.this.getClass().getSimpleName(), classpathEntry);
        }

        Log.e("FUTTER", FlutterMain.class.getClassLoader().toString());
    }
}
