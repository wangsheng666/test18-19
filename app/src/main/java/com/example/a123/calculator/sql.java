package com.example.a123.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by 123 on 2016/9/2.
 */
public class MainActivity extends AppCompatActivity {
    WordsDBHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sql);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //新增单词
                InsertDialog();
            }
        });

        //为ListView注册上下文菜单
        ListView list = (ListView) findViewById(R.id.lstWords);
        registerForContextMenu(list);


        //创建SQLiteOpenHelper对象，注意第一次运行时，此时数据库并没有被创建
        mDbHelper = new WordsDBHelper(this);

        //在列表显示全部单词
        ArrayList<Map<String, String>> items=getAll();
        setWordsListView(items);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDbHelper.close();
    }



}