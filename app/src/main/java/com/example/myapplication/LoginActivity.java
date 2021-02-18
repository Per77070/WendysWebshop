package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;



public class LoginActivity extends AppCompatActivity {
FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        mAuth =FirebaseAuth.getInstance();
mAuthListener= new FirebaseAuth.AuthStateListener() {
    @Override
    public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

        FirebaseUser user = firebaseAuth.getCurrentUser();






    }


};

    }

    public void login(View view) {

        EditText emailAdress = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText passWord = (EditText) findViewById(R.id.editTextTextPassword);
        String email = emailAdress.getText().toString();
        String password = passWord.getText().toString();

        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Toast.makeText(LoginActivity.this,"Logged in successfully.",Toast.LENGTH_LONG).show();
                            Intent choiceIntent = new Intent(LoginActivity.this,FoodActivity.class)  ;
                            startActivity(choiceIntent);
                        }

                        else {

                            String message = task.getException().toString();

                            Toast.makeText(LoginActivity.this, "Error: "+message, Toast.LENGTH_LONG ).show();



                        }



                    }
                });



    };




}