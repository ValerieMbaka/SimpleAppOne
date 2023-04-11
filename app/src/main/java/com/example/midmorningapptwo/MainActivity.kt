package com.example.midmorningapptwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mTitle:TextView
    lateinit var btnCalc:Button
    lateinit var btnWeb:Button
    lateinit var btnContacts:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalc = findViewById(R.id.mBtnCalc)
        btnWeb = findViewById(R.id.mBtnWeb)
        btnContacts = findViewById(R.id.mBtnContacts)

        btnCalc.setOnClickListener {
            val kikokotoo = Intent(this, CalculatorActivity::class.java)
            startActivity(kikokotoo)
        }

        btnWeb.setOnClickListener {
            val tembea = Intent(this, WebsiteActivity::class.java)
            startActivity(tembea)
        }

        btnContacts.setOnClickListener {
            val nambari = Intent(this, ContactsActivity::class.java)
            startActivity(nambari)
        }
    }
}