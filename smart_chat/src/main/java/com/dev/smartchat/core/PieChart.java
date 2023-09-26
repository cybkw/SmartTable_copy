package com.dev.smartchat.core;

import android.content.Context;
import android.util.AttributeSet;

import com.dev.smartchat.core.base.BaseRotateChart;
import com.dev.smartchat.data.PieData;
import com.dev.smartchat.matrix.RotateHelper;
import com.dev.smartchat.provider.pie.PieProvider;


/**
 * Created by huang on 2017/10/9.
 * 饼图
 */

public class PieChart  extends BaseRotateChart<PieProvider, PieData> {


    public PieChart(Context context) {
        super(context);
    }

    public PieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PieChart(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }




    @Override
    protected PieProvider initProvider(RotateHelper rotateHelper) {
        PieProvider provider =  new PieProvider();
        provider.setRotateHelper(rotateHelper);
        return provider;
    }



}
