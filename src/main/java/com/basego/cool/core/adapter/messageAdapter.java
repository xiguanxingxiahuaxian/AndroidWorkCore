package com.basego.cool.core.adapter;

import android.content.Context;

import com.basego.cool.core.R;
import com.basego.cool.core.bean.messageDTO;
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
public class messageAdapter extends SuperBaseAdapter<messageDTO.PageBean.ListBean>{

    public messageAdapter(Context context, List<messageDTO.PageBean.ListBean> data) {
        super(context, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, messageDTO.PageBean.ListBean item, int position) {
        holder.setText(R.id.pos,(position+1)+"");
        holder.setText(R.id.content,item.getContent()==null?"":item.getContent());
        holder.setText(R.id.cjr,item.getShijian()==null?"":item.getShijian());
        holder.setText(R.id.sj,item.getShijian()==null?"":item.getShijian());
    }

    @Override
    protected int getItemViewLayoutId(int position, messageDTO.PageBean.ListBean item) {
        return R.layout.message_layout;
    }
}
