package com.example.applicationlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //from login to forgot password in button click
        val btnSwitchToForgotPasswordLogin : Button = findViewById(R.id.btnForgotPasswordLogin)
        btnSwitchToForgotPasswordLogin.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }

        //from login to sign up in button click
        val btnSwitchToSignUp : Button = findViewById(R.id.btnSignUpLogin)
        btnSwitchToSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)


        }

    }
}