package com.dev.smart.table;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dev.smart.form.core.SmartTable;
import com.dev.smart.form.data.style.FontStyle;
import com.dev.smart.table.bean.ChildData;
import com.dev.smart.table.bean.MergeInfo;
import com.dev.smartchat.utils.DensityUtils;

import java.util.ArrayList;
import java.util.List;

public class MergeModeActivity extends AppCompatActivity {

    private SmartTable<MergeInfo> table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_table);
        FontStyle.setDefaultTextSize(DensityUtils.sp2px(this,15));
       
        List<MergeInfo> list = new ArrayList<>();
        for(int i = 0;i <50; i++) {
            list.add(new MergeInfo("huangyanbinhuangyanbinhuangyanbinhuangyanbin", 18, System.currentTimeMillis(),true,new ChildData("测试1")));
            list.add(new MergeInfo("huangyanbinhuangyanbinhuangyanbinhuangyanbin", 18, System.currentTimeMillis(),true,new ChildData("测试1")));
            list.add(new MergeInfo("huangyanbinhuangyanbinhuangyanbinhuangyanbin", 18, System.currentTimeMillis(),true,new ChildData("测试1")));
            list.add(new MergeInfo("huangyanbinhuangyanbinhuangyanbinhuangyanbin", 18, System.currentTimeMillis(),true,new ChildData("测试1")));
            list.add(new MergeInfo("lihuangyanbinhuangyanbinhuangyanbinhuangyanbin", 23, System.currentTimeMillis(),false,null));
            list.add(new MergeInfo("lihuangyanbinhuangyanbinhuangyanbinhuangyanbin", 23, System.currentTimeMillis(),false,null));
            list.add(new MergeInfo("lihuangyanbinhuangyanbinhuangyanbinhuangyanbin", 23, System.currentTimeMillis(),false,null));
            list.add(new MergeInfo("lihuangyanbinhuangyanbinhuangyanbinhuangyanbin", 23, System.currentTimeMillis(),false,null));
        }
        table = (SmartTable<MergeInfo>) findViewById(R.id.table);
        table.setData(list);
        table.getConfig().setShowTableTitle(false);
        table.setZoom(true,2,0.2f);

    }

}
