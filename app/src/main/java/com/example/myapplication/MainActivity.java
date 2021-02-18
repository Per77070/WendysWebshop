package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.sampledata.DataItem;
import com.example.myapplication.sampledata.SampleDataProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView dataTextView;
List<DataItem> dataItemList = SampleDataProvider.dataItemList;
    List<String>   itemnames = new ArrayList<>();
    public static final String ITEM_ID_KEY = "item_id_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataTextView = findViewById(R.id.list_item);
        //DataItem item = new DataItem(null, "menuitem", "A description","A category",1,9.95,"apple_pie.jpg" );
/*
for (DataItem item:dataItemList)

{
        //dataTextView.append(item.getCategory()+"\n");
    itemnames.add(item.getItemName());

    }
       */


        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(   this,  android.R.layout.simple_list_item_1,itemnames);
        DataItemAdapter adapter = new DataItemAdapter(this,dataItemList);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvItems);
             recyclerView.setAdapter(adapter);






                }
            }


