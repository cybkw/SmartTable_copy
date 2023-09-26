package com.dev.smartchat.core;

import android.content.Context;
import android.util.AttributeSet;

import com.dev.smartchat.core.base.BaseRotateChart;
import com.dev.smartchat.data.RoseData;
import com.dev.smartchat.matrix.RotateHelper;
import com.dev.smartchat.provider.rose.RoseProvider;


/**
 * Created by huang on 2017/10/9.
 * 饼图
 */

public class RoseChart extends BaseRotateChart<RoseProvider, RoseData> {


    public RoseChart(Context context) {
        super(context);
    }

    public RoseChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RoseChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected RoseProvider initProvider(RotateHelper rotateHelper) {
        RoseProvider provider =  new RoseProvider();
        provider.setRotateHelper(rotateHelper);
        return provider;
    }
}
