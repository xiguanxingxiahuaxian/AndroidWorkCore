package com.basego.cool.core.base;

import android.app.Application;

import com.basego.cool.core.net.DefaultNetChangeObserver;
import com.basego.cool.core.net.NetworkStateReceiver;

public class BaseApp extends Application {

    private static   BaseApp baseApp;
    private DefaultNetChangeObserver defaultNetChangeObserver;
    @Override
    public void onCreate() {
        super.onCreate();
        //注册网络
        baseApp=this;
        registerNetworkStateReceiver();
    }
    public void registerNetworkStateReceiver() {
        NetworkStateReceiver.registerNetworkStateReceiver(this);
        defaultNetChangeObserver = new DefaultNetChangeObserver(this);
        NetworkStateReceiver.registerObserver(defaultNetChangeObserver);
    }
    public void unRegisterNetworkStateReceiver() {
        NetworkStateReceiver.unRegisterNetworkStateReceiver(this);
        NetworkStateReceiver.removeRegisterObserver(defaultNetChangeObserver);
    }
    //创建单例
    public static BaseApp getInstance(){
        return   baseApp;
    }
}
