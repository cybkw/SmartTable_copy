package com.dev.smartchat.provider;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.animation.Interpolator;

import com.dev.smartchat.core.base.BaseChart;
import com.dev.smartchat.data.ChartData;
import com.dev.smartchat.data.ColumnData;
import com.dev.smartchat.listener.OnClickColumnListener;
import com.dev.smartchat.matrix.MatrixHelper;
import com.dev.smartchat.provider.component.mark.IMark;


/**
 * Created by huang on 2017/9/26.
 */

public interface IProvider<C extends ColumnData> {

     boolean calculation( ChartData<C> chartData);

     void drawProvider(Canvas canvas, Rect rect, MatrixHelper helper, Paint paint);

     void clickPoint(PointF point);
     void startAnim(BaseChart chartView, int duration, Interpolator interpolator);

     void setMarkView(IMark markView);

     void setOnClickColumnListener(OnClickColumnListener<C> onClickColumnListener);

}
