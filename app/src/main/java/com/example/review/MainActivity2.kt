package com.example.review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var nameTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         nameTV=findViewById(R.id.textView)
        val sendName=intent.getStringExtra("sendName")
        nameTV.setText(sendName )

    }
}