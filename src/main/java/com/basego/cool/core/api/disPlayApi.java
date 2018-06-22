package com.basego.cool.core.api;

import com.basego.cool.core.bean.displayDTO;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/9 11:05
 * 修改备注
 */
public interface disPlayApi  {

    @GET("getListType")

    Observable<displayDTO>getList(@Query("machinestatus")String machinestatus
    ,@Query("pageSize") int pageSize,@Query("pageNo")int pageNo);

}
