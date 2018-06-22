package com.basego.cool.core.adapter;

import android.content.Context;

import com.basego.cool.core.R;
import com.basego.cool.core.bean.examDTO;
import com.superrecycleview.superlibrary.adapter.BaseViewHolder;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;

import java.util.List;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/11 18:07
 * 修改备注
 */
public class examAdapter extends SuperBaseAdapter<examDTO.PageBean.ListBean>{

    public examAdapter(Context context, List<examDTO.PageBean.ListBean> data) {
        super(context, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, examDTO.PageBean.ListBean item, int position) {
        holder.setText(R.id.pos,(position+1)+"");
        holder.setText(R.id.cjr,item.getClassroom()==null?"":item.getClassroom());
        holder.setText(R.id.sj,item.getTeacher()==null?"":item.getTeacher());
        holder.setText(R.id.content,item.getSubject()==null?"":item.getSubject());
        holder.setText(R.id.approveStatus,item.getApproveStatus()==null?"":item.getApproveStatus());
        holder.setText(R.id.shijianStart,item.getShijianStart()==null?"":item.getShijianStart());
        holder.setText(R.id.shijianEnd,item.getShijianEnd()==null?"":item.getShijianEnd());
    }

    @Override
    protected int getItemViewLayoutId(int position, examDTO.PageBean.ListBean item) {
        return R.layout.course_layout;
    }
}
