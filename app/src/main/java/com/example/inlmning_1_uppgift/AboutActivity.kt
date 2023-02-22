package com.example.inlmning_1_uppgift
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class AboutActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val buttonNavigate : Button = findViewById(R.id.btn_navigateToSignIn)

        buttonNavigate.setOnClickListener {
            val intentNavigate = Intent(this, SignInActivity::class.java)
            startActivity(intentNavigate)

        }


    }
}