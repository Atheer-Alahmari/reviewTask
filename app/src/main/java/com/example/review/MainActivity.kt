package com.example.review

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var nameED:EditText
    lateinit var goB:Button
    lateinit var alertB:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameED=findViewById(R.id.editText)
        goB=findViewById(R.id.button)
        alertB=findViewById(R.id.button2)

        goB.setOnClickListener {
            val sendName=nameED.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("sendName",sendName)
            startActivity(intent)
        }
    }

    fun alertButton(view: android.view.View) {// فيه طريقتين لاستخدام البتن (btn.setOnClickListener or   android:onClick="alertButton" in xml)
        var alt=AlertDialog.Builder(this)
        alt.setMessage("Hi ${nameED.text.toString()}")
        alt.setTitle("Review")
        alt.show()
    }

    //to declear menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)

    }
    fun menuwork(item: android.view.MenuItem) {
        Toast.makeText(applicationContext,"it's work ",Toast.LENGTH_SHORT).show()

    }



}


