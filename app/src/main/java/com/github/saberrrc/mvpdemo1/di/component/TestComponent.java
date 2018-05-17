package com.github.saberrrc.mvpdemo1.di.component;

import com.github.saberrrc.mvpdemo1.di.module.TestModule;
import com.github.saberrrc.mvpdemo1.mvp.ui.activity.TestActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = TestModule.class, dependencies = AppComponent.class)
public interface TestComponent {
    void inject(TestActivity activity);
}