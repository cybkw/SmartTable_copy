package com.dev.smart.table;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.dev.smart.form.core.SmartTable;
import com.dev.smart.form.data.style.FontStyle;
import com.dev.smart.table.adapter.SheetAdapter;
import com.dev.smart.table.excel.ExcelCallback;
import com.dev.smart.table.excel.IExcel2Table;
import com.dev.smart.table.excel.POIExcel2Table;
import com.dev.smartchat.utils.DensityUtils;

import org.apache.poi.ss.usermodel.Cell;

import java.util.List;

/**
 * 通过poi来填充表格
 * 暂时只能支持xls
 */
public class POIExcelModeActivity extends AppCompatActivity implements ExcelCallback {

    private SmartTable<Cell> table;

    private RecyclerView recyclerView;
    private String fileName = "c.xls";
    private IExcel2Table<Cell> iExcel2Table;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excel_table);
        FontStyle.setDefaultTextSize(DensityUtils.sp2px(this,15));
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        table = (SmartTable<Cell>) findViewById(R.id.table);
        iExcel2Table = new POIExcel2Table();
        iExcel2Table.initTableConfig(this,table);
        iExcel2Table.setCallback(this);
        iExcel2Table.loadSheetList(this,fileName);




    }




    @Override
    protected void onDestroy() {
        if(iExcel2Table !=null){
            iExcel2Table.clear();
        }
        iExcel2Table = null;
        super.onDestroy();
    }

    @Override
    public void getSheetListSuc(List<String> sheetNames) {
        recyclerView.setHasFixedSize(true);
        if(sheetNames!=null && sheetNames.size() >0) {
            final SheetAdapter sheetAdapter = new SheetAdapter(sheetNames);
            sheetAdapter.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                    sheetAdapter.setSelectPosition(position);
                    iExcel2Table.loadSheetContent(POIExcelModeActivity.this,position);
                }
            });
            recyclerView.setAdapter(sheetAdapter);
            iExcel2Table.loadSheetContent(POIExcelModeActivity.this,0);
        }
    }

}
