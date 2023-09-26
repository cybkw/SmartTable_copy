package com.dev.smartchat.listener;


import com.dev.smartchat.component.Legend;
import com.dev.smartchat.data.ColumnData;

/**
 * Created by huang on 2017/9/30.
 */

public interface OnClickLegendListener<C extends ColumnData> {

   void onClickLegend(C c, Legend<C> legend);
}
