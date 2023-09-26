package com.dev.smartchat.listener;

import com.dev.smartchat.data.ColumnData;

/**
 * Created by huang on 2017/9/30.
 */

public interface OnClickColumnListener<C extends ColumnData> {

   void onClickColumn(C c,int position);
}
