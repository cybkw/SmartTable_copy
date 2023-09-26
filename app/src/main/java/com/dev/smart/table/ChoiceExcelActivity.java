package com.dev.smart.table;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.dev.smart.form.core.SmartTable;
import com.dev.smart.form.data.style.FontStyle;
import com.dev.smart.table.adapter.SheetAdapter;
import com.dev.smart.table.excel.ExcelCallback;
import com.dev.smart.table.excel.IExcel2Table;
import com.dev.smart.table.excel.JXLExcel2Table;
import com.dev.smartchat.utils.DensityUtils;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

import jxl.Cell;

public class ChoiceExcelActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , ExcelCallback {
    private SmartTable<Cell> table;
    private RecyclerView recyclerView;
    private IExcel2Table<Cell> iExcel2Table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_excel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        FontStyle.setDefaultTextSize(DensityUtils.sp2px(this,15));
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        table = (SmartTable<Cell>) findViewById(R.id.table);
        iExcel2Table = new JXLExcel2Table();
        iExcel2Table.initTableConfig(this,table);
        iExcel2Table.setCallback(this);
        iExcel2Table.loadSheetList(this, "c.xls");
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
                    iExcel2Table.loadSheetContent(ChoiceExcelActivity.this,position);
                }
            });
            recyclerView.setAdapter(sheetAdapter);
            iExcel2Table.loadSheetContent(ChoiceExcelActivity.this,0);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_import) {
//            Intent intent4 = new Intent(this, NormalFilePickActivity.class);
//            intent4.putExtra(Constant.MAX_NUMBER, 1);
//            intent4.putExtra(NormalFilePickActivity.SUFFIX, new String[] {"xls"});
//            startActivityForResult(intent4, Constant.REQUEST_CODE_PICK_FILE);
        } else if (id == R.id.nav_export) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
//            case Constant.REQUEST_CODE_PICK_FILE:
//                if (resultCode == RESULT_OK) {
//                    ArrayList<NormalFile> list = data.getParcelableArrayListExtra(Constant.RESULT_PICK_FILE);
//                    if(list !=null && list.size()>0){
//                        iExcel2Table.setIsAssetsFile(false);
//                        iExcel2Table.loadSheetList(this,list.get(0).getPath());
//                    }
//                }
//                break;
        }
    }
}
