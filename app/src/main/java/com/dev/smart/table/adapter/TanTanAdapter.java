package com.dev.smart.table.adapter;

import android.net.Uri;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dev.smart.table.R;
import com.dev.smart.table.bean.TanBean;

import java.util.List;

/**
 * Created by huang on 2017/10/13.
 */

public class TanTanAdapter extends BaseQuickAdapter<TanBean, BaseViewHolder> {


    public TanTanAdapter(@Nullable List<TanBean> data) {
        super(R.layout.item_tantan, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TanBean item) {
        helper.setText(R.id.tvName,item.getName());
        Glide
                .with(getContext())
                .load(item.getUrl())
                .into((ImageView) helper.getView(R.id.iv));
    }
}
