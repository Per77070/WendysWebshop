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
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView categoryTextView = findViewById(R.id.categoryTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        TextView priceTextView = findViewById(R.id.descriptionTextView);

String itemId = getIntent().getExtras().getString(DataItemAdapter.ITEM_ID_KEY);
DataItem item = SampleDataProvider.dataItemMap.get(itemId);

        nameTextView.setText(item.getItemName());
        categoryTextView.setText(item.getDescription());
        descriptionTextView.setText(item.getCategory());

    }
}