package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
//import com.google.firebase.firestore.CollectionReference;
//import com.google.firebase.firestore.FieldValue;
//import com.google.firebase.firestore.FirebaseFirestore;
//import com.google.firebase.firestore.QueryDocumentSnapshot;
//import com.google.firebase.firestore.QuerySnapshot;
import com.example.myapplication.model.DataItem;
import com.example.myapplication.sampledata.SampleDataProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        try {
            showDetails();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    //FirebaseDatabase database = FirebaseDatabase.getInstance();
    CollectionReference noteBookRef = db.collection("users");
    //DatabaseReference myRef = database.getReference();



    private void showDetails() throws IOException {

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView categoryTextView = findViewById(R.id.categoryTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        TextView priceTextView = findViewById(R.id.priceTextView);
        ImageView imageView = findViewById(R.id.imageView);
        String itemId = getIntent().getExtras().getString(DataItemAdapter.ITEM_ID_KEY);
        DataItem item = SampleDataProvider.dataItemMap.get(itemId);

        String imageFile = item.getImage();
        InputStream inputStream = getAssets().open(imageFile);
        Drawable d = Drawable.createFromStream(inputStream,null);
        imageView.setImageDrawable(d);

        nameTextView.setText(item.getItemName());
        categoryTextView.setText(item.getDescription());
        descriptionTextView.setText(item.getCategory());
        priceTextView.setText(item.getPrice().toString());

    }


    public void orderBtn(View view) {

        String itemId = getIntent().getExtras().getString(DataItemAdapter.ITEM_ID_KEY);
        DataItem item = SampleDataProvider.dataItemMap.get(itemId);
        final String dish = item.getItemName();

        final HashMap<String,String> order = new HashMap<>();

        order.put("dish",dish);



        noteBookRef.add(order);




    }




}