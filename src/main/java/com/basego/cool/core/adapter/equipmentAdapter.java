package com.basego.cool.core.adapter;

import android.content.Context;
import android.view.View;

import com.basego.cool.core.R;
import com.basego.cool.core.bean.equipmentDTO;
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
public class equipmentAdapter extends SuperBaseAdapter<equipmentDTO.PageBean.ListBean> {

    private getEquipment getequipment;

    public equipmentAdapter(Context context, List<equipmentDTO.PageBean.ListBean> data) {
        super(context, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, equipmentDTO.PageBean.ListBean item, final int position) {
        holder.setText(R.id.pos,(position+1)+"");
        holder.setText(R.id.cjr,item.getEquipmentName()==null?"":item.getEquipmentName());
        holder.setText(R.id.sj,item.getEquipmentAddress()==null?"":item.getEquipmentAddress());
        holder.setText(R.id.content,item.getProblem()==null?"":item.getProblem());
        holder.setText(R.id.approveStatus,item.getCreateBy()==null?"":item.getCreateBy());
        holder.setOnClickListener(R.id.item, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getequipment!=null){
                    getequipment.getDTO(view,position);
                }
            }
        });
    }

    @Override
    protected int getItemViewLayoutId(int position, equipmentDTO.PageBean.ListBean item) {
        return R.layout.equip_layout;
    }

    public void  getEquipment(getEquipment getequipment){
        this.getequipment=getequipment;
    }
    public interface getEquipment{
        void getDTO(View view,int pos);
    }
}
