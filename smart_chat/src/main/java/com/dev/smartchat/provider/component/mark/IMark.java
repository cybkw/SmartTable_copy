package com.dev.smartchat.provider.component.mark;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.dev.smartchat.data.ColumnData;


/**
 * Created by huang on 2017/9/28.
 */

public  interface IMark<C extends ColumnData> {
    /**
     * 绘制Mark
     */
    void drawMark(Canvas canvas,float x, float y,Rect rect, String content, C data, int position);
}
