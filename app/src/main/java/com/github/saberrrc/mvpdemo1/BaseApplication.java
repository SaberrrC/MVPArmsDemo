package com.github.saberrrc.mvpdemo1;

import android.app.Application;
import android.support.annotation.NonNull;

import com.jess.arms.base.App;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

public class BaseApplication extends Application implements App {

    @NonNull
    @Override
    public AppComponent getAppComponent() {
        return ArmsUtils.obtainAppComponentFromContext(this);
    }
}
