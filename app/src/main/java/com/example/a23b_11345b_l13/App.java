package com.example.a23b_11345b_l13;

import android.app.Application;

import com.example.a23b_11345b_l13.Utilities.ImageLoader;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoader.initImageLoader(this);
    }
}
