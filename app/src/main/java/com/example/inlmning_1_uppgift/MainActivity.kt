package com.example.inlmning_1_uppgift

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNavigate : Button = findViewById(R.id.btn_navigateToAbout)
        buttonNavigate.setOnClickListener {
            val intentNavigate = Intent(this,AboutActivity::class.java)
            startActivity(intentNavigate)
        }
    }
}