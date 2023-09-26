package com.dev.smartchat.component.base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import com.dev.smartchat.data.BarData;
import com.dev.smartchat.data.ChartData;
import com.dev.smartchat.data.format.IFormat;
import com.dev.smartchat.matrix.MatrixHelper;

/**
 * Created by huangYanBin on 2017/9/26.
 * 轴接口
 */

public interface IAxis<V> {

     void draw(Canvas canvas, Rect rect, MatrixHelper helper, Paint paint, ChartData<? extends BarData> chartData);
     void computeScale(ChartData<? extends BarData> chartData, Rect rect, Paint paint);
     void  setAxisDirection(int axisDirection);
     void setFormat(IFormat<V> format);
     IFormat<V> getFormat();
     void setDisplay(boolean isShow);

     /**
      * Created by huangYanBin on 2017/9/26.
      * 轴方向
      */

     interface AxisDirection {
         int TOP = 1;
         int BOTTOM=2;
         int LEFT = 3;
         int RIGHT = 4;
     }
}
