package com.github.saberrrc.mvpdemo1.mvp.model;

import android.app.Application;

import com.github.saberrrc.mvpdemo1.mvp.contract.TestContract;
import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;


@ActivityScope
public class TestModel extends BaseModel implements TestContract.Model {
    @Inject
    Gson        mGson;
    @Inject
    Application mApplication;

    @Inject
    public TestModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    public Observable<List<User>> getUsers(int lastIdQueried, boolean update) {
//        Observable<List<User>> users = mRepositoryManager.obtainRetrofitService(CommonCache.class)
//                .getUsers(lastIdQueried, USERS_PER_PAGE);
        //使用rxcache缓存,上拉刷新则不读取缓存,加载更多读取缓存
//        return mRepositoryManager.obtainCacheService(CommonCache.class)
//                .getUsers(users
//                        , new DynamicKey(lastIdQueried)
//                        , new EvictDynamicKey(update))
//                .flatMap(new Function<Reply<List<User>>, Observable<List<User>>>() {
//                    @Override
//                    public Observable<List<User>> apply(Reply<List<User>> listReply) throws Exception {
//                        return Observable.just(listReply.getData());
//                    }
//                });
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }
}