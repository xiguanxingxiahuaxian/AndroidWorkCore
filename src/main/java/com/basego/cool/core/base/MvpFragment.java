package com.basego.cool.core.base;

import android.os.Bundle;

import com.basego.cool.core.api.SubscriptionManager;

/**
 * 项目名称：Basego
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2017/9/6 12:48
 * 修改备注
 */
public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment implements BaseView{
    public  P presener;

    @Override
    public void initBefore(Bundle savedInstanceState) {
        super.initBefore(savedInstanceState);
        presener=initPresenter();
        presener.addView(this);
    }

    protected abstract P initPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        presener.detattch();
        SubscriptionManager.getInstance().cancelall();
    }
}
