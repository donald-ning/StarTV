package cn.edu.sspu.startv;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class TRTCApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
