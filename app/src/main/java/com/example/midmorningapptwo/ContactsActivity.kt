package com.example.midmorningapptwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class ContactsActivity : AppCompatActivity() {
    lateinit var myContacts:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        myContacts = findViewById(R.id.mContactsList)
        myContacts.setOnItemClickListener { adapterView, view, i, l ->
            val name = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this, name, Toast.LENGTH_LONG).show()
        }
    }
}