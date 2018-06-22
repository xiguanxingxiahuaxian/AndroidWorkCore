package com.basego.cool.core.view.activity.impl;

import com.basego.cool.core.api.ExceptionHandle;
import com.basego.cool.core.base.BaseView;

/**
 * 项目名称：Basego
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2017/9/6 11:53
 * 修改备注
 */
public interface SimpleView extends BaseView {
    void  onSuccess(Object object);
    void  onFail(ExceptionHandle.ResponeThrowable t);

}
