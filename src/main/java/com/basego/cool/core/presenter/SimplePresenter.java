package com.basego.cool.core.presenter;

import com.basego.cool.core.base.BasePresenter;
import com.basego.cool.core.model.SimpleModel;
import com.basego.cool.core.view.activity.impl.SimpleView;

/**
 * 项目名称：Basego
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2017/9/6 11:58
 * 修改备注
 */
public class SimplePresenter extends BasePresenter<SimpleView> {

    private final SimpleModel simpleModel;

    public SimplePresenter() {
       simpleModel=new SimpleModel();
    }
    public void getData(){

    }
}
