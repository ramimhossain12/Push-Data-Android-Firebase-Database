package com.example.pushdataandroidfirebasedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    DatabaseReference databaseReference ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        databaseReference = FirebaseDatabase.getInstance().getReference().child("Test");

        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("Name","Happy coding");
        databaseReference.child("user").push().setValue(hashMap);
    }
}