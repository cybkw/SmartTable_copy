package com.dev.smartchat.core;

import android.content.Context;
import android.util.AttributeSet;

import com.dev.smartchat.core.base.BaseRotateChart;
import com.dev.smartchat.data.RadarData;
import com.dev.smartchat.matrix.RotateHelper;
import com.dev.smartchat.provider.radar.RadarProvider;

/**
 * Created by huang on 2017/10/9.
 * 雷达图
 */

public class RadarChart extends BaseRotateChart<RadarProvider, RadarData> implements RotateHelper.OnRotateListener{


    public RadarChart(Context context) {
        super(context);
    }

    public RadarChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RadarChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }




    @Override
    protected RadarProvider initProvider(RotateHelper rotateHelper) {
        RadarProvider provider =  new RadarProvider();
        provider.setRotateHelper(rotateHelper);
        return provider;
    }
}
