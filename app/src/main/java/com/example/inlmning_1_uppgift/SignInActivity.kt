package com.example.inlmning_1_uppgift

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val buttonNavigate : Button = findViewById(R.id.btn_navigateToLogedIn)
        val userInputName : EditText = findViewById(R.id.userNameText)
        val userInputPassword : EditText = findViewById(R.id.userPasswordText)
        val userName = arrayOf("mariana")
        val userPassword = arrayOf("blog")


        buttonNavigate.setOnClickListener {
            val inputName  = userInputName.text.toString()
            val inputPassword = userInputPassword.text.toString()


            if (userName.contains(inputName) && userPassword.contains(inputPassword)) {
                val intentNavigate = Intent(this, LogedInActivity::class.java).apply {
                    putExtra("key_username", userInputName.text.toString())}
                startActivity(intentNavigate)
                Toast.makeText(this,"WELCOME",Toast.LENGTH_LONG).show()

            }

            else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_LONG).show()
                println("Sorry, Invalid username or password")
            }

        }


    }
}