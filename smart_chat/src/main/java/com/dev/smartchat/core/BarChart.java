package com.dev.smartchat.core;

import android.content.Context;
import android.util.AttributeSet;

import com.dev.smartchat.core.base.BaseBarLineChart;
import com.dev.smartchat.data.BarData;
import com.dev.smartchat.provider.barLine.BarProvider;


/**
 * Created by huang on 2017/9/26.
 * 柱状图
 */

public class BarChart extends BaseBarLineChart<BarProvider<BarData>,BarData> {

    public BarChart(Context context) {
        super(context);
    }

    public BarChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BarChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }




    @Override
    protected BarProvider initProvider() {
        return new BarProvider();
    }


}
