package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.firestore.CollectionReference;
//import com.google.firebase.firestore.FirebaseFirestore;

public class RegisterActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    //FirebaseFirestore db = FirebaseFirestore.getInstance();
    //CollectionReference noteBookRef = db.collection("users");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();



    }

    public void register(View view) {

        EditText emailRegister = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText passwordRegister = (EditText) findViewById(R.id.editTextTextPassword);



        String email = emailRegister.getText().toString();
        String password = passwordRegister.getText().toString();


        if (TextUtils.isEmpty(email)){

            Toast.makeText(RegisterActivity.this, "Please write yor e-mail.", Toast.LENGTH_SHORT).show();

        }
        else if (TextUtils.isEmpty(password)){

            Toast.makeText(RegisterActivity.this, "Please write yor password.", Toast.LENGTH_SHORT).show();

        }

        else {

            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){

                                Toast.makeText(RegisterActivity.this,"Signed in successfully.",Toast.LENGTH_LONG).show();
                                Intent foodIntent = new Intent(RegisterActivity.this,FoodActivity.class)  ;
                                startActivity(foodIntent);
                            }

                            else {

                                String message = task.getException().toString();

                                Toast.makeText(RegisterActivity.this, "Error: "+message, Toast.LENGTH_LONG ).show();



                            }


                        }
});}}}