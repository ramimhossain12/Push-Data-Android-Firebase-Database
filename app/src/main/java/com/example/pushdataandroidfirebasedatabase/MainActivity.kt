package com.example.pushdataandroidfirebasedatabase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class MainActivity : AppCompatActivity() {
    var databaseReference: DatabaseReference? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        databaseReference = FirebaseDatabase.getInstance().reference.child("Test")
        val hashMap = HashMap<String, String>()
        hashMap["Name"] = "Happy coding"
        databaseReference!!.child("user").push().setValue(hashMap)
    }
}