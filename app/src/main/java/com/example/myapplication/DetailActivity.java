package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.sampledata.DataItem;
import com.example.myapplication.sampledata.SampleDataProvider;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView textView =(TextView) findViewById(R.id.textView);
String itemId = getIntent().getExtras().getString(MainActivity.ITEM_ID_KEY);
        DataItem item = SampleDataProvider.dataItemMap.get(itemId);
        textView.setText(itemId);
        Toast.makeText(this,""+item.getItemName(),Toast.LENGTH_SHORT).show();



    }
}