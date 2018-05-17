package com.github.saberrrc.mvpdemo1.mvp.presenter;

import android.app.Application;

import com.github.saberrrc.mvpdemo1.mvp.contract.TestContract;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;

import javax.inject.Inject;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;


@ActivityScope
public class TestPresenter extends BasePresenter<TestContract.Model, TestContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application    mApplication;
    @Inject
    ImageLoader    mImageLoader;
    @Inject
    AppManager     mAppManager;

    @Inject
    public TestPresenter(TestContract.Model model, TestContract.View rootView) {
        super(model, rootView);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }
}
