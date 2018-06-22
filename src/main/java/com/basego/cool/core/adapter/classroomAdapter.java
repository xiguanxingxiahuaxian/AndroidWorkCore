package com.basego.cool.core.adapter;

import android.content.Context;

import com.basego.cool.core.R;
import com.basego.cool.core.bean.classRoomDTO;
import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;

import java.util.List;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/11 16:47
 * 修改备注
 */
public class classroomAdapter extends SuperBaseAdapter<classRoomDTO.PageBean.ListBean> {

    public classroomAdapter(Context context, List<classRoomDTO.PageBean.ListBean> data) {
        super(context, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, classRoomDTO.PageBean.ListBean item, int position) {

        holder.setText(R.id.pos,(position+1)+"");
        holder.setText(R.id.sj,item.getClassroomNum()==null?"":item.getClassroomNum());
        holder.setText(R.id.content,item.getClassroomType()==null?"":item.getClassroomType());

        holder.setText(R.id.approveStatus,item.getIsAppointment()==null?"":item.getIsAppointment());
        holder.setText(R.id.shijianStart,item.getShijianStart()==null?"":item.getShijianStart());
        holder.setText(R.id.shijianEnd,item.getShijianEnd()==null?"":item.getShijianEnd());
        holder.setText(R.id.shzt,item.getApproveStatus()==null?"":item.getApproveStatus());
        holder.setText(R.id.createBy,item.getCreateBy()==null?"":item.getCreateBy());



    }

    @Override
    protected int getItemViewLayoutId(int position, classRoomDTO.PageBean.ListBean item) {
        return R.layout.classroom_layout;
    }
}
