package com.example.inlmning_1_uppgift

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class LogedInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loged_in)
        val displayUsername : TextView = findViewById(R.id.textView_displayName)
        displayUsername.text = intent.getStringExtra("key_username")






    }
}