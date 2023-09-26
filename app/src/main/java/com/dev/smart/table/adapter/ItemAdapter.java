package com.dev.smart.table.adapter;


import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dev.smart.table.R;
import com.dev.smart.table.bean.MainItem;

import java.util.List;

/**
 * Created by huang on 2017/10/13.
 */

public class ItemAdapter extends BaseQuickAdapter<MainItem, BaseViewHolder> {


    public ItemAdapter(@Nullable List<MainItem> data) {
        super(R.layout.item_main, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainItem item) {
        helper.setText(R.id.tv_chart_name,item.chartName);
    }
}
