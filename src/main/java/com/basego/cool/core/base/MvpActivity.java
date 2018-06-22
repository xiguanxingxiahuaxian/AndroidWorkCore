package com.basego.cool.core.base;

import android.os.Bundle;

import com.basego.cool.core.api.SubscriptionManager;

/**
 * 项目名称：Basego
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2017/9/6 11:55
 * 修改备注
 */
public abstract class MvpActivity <P extends BasePresenter> extends BaseActivity implements BaseView{
    public  P presener;

    @Override
    public void initBefore(Bundle savedInstanceState) {
        super.initBefore(savedInstanceState);
        presener =initPresener();
        presener.addView(this);
    }

    protected abstract P initPresener();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presener.detattch();
        SubscriptionManager.getInstance().cancelall();
    }
}
