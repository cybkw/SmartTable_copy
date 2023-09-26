package com.dev.smartchat.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;

import com.dev.smartchat.core.base.BaseBarLineChart;
import com.dev.smartchat.data.LineData;
import com.dev.smartchat.exception.ChartException;
import com.dev.smartchat.provider.barLine.LineProvider;
import com.dev.smartchat.provider.component.line.BrokenLineModel;
import com.dev.smartchat.provider.component.line.CurveLineModel;

/**
 * Created by huang on 2017/9/26.
 * 线性图
 */

public class LineChart extends BaseBarLineChart<LineProvider, LineData> {

    public static final int LINE_MODEL = 0;
    public static final  int CURVE_MODEL = 1;

    public LineChart(Context context) {
        super(context);
    }

    public LineChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LineChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected LineProvider initProvider() {
        horizontalAxis.setGravity(Gravity.LEFT);
        horizontalAxis.isLine(true);
        return new LineProvider();
    }

    public void setLineModel(int model){
        if(model == LINE_MODEL){
            provider.setLineModel(new BrokenLineModel());
        }else if( model == CURVE_MODEL){
            provider.setLineModel(new CurveLineModel());
        }else {
            throw new ChartException("Please set the correct Line model");
        }
    }

}
