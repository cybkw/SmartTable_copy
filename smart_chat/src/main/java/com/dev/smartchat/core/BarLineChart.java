package com.dev.smartchat.core;

import android.content.Context;
import android.util.AttributeSet;

import com.dev.smartchat.core.base.BaseBarLineChart;
import com.dev.smartchat.data.BarLineData;
import com.dev.smartchat.provider.barLine.BarLineProvider;

/**
 * Created by huang on 2017/9/26.
 * 柱状图
 */

public class BarLineChart extends BaseBarLineChart<BarLineProvider, BarLineData> {

    public BarLineChart(Context context) {
        super(context);
    }

    public BarLineChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BarLineChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }




    @Override
    protected BarLineProvider initProvider() {
        return new BarLineProvider();
    }


}
