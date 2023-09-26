package com.dev.smartchat.component.base;

import android.graphics.PointF;

import com.dev.smartchat.data.ChartData;
import com.dev.smartchat.data.ColumnData;
import com.dev.smartchat.data.style.FontStyle;
import com.dev.smartchat.listener.OnClickLegendListener;
import com.dev.smartchat.provider.component.point.ILegendPoint;
import com.dev.smartchat.provider.component.point.IPoint;


/**
 * Created by huang on 2017/10/26.
 */

public interface ILegend<C extends ColumnData> extends IComponent<ChartData<C>> {

    float getPercent();

    void setPercent(float percent);

    FontStyle getFontStyle();

    int getDirection();

    void setDirection(int direction);

    void setFontStyle(FontStyle fontStyle);

    void onClickLegend(PointF pointF);

    void setOnClickLegendListener(OnClickLegendListener<C> onClickLegendListener);


    int getPadding();

    void setPadding(int padding);

    IPoint getPoint();

    void setPoint(ILegendPoint point);

    void setSelectColumn(boolean selectColumn);

    void setDisplay(boolean isDisplay);
}