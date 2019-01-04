package com.squishy.probeersel

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        GoToForgotPassword_btn.setOnClickListener {
            val intent = Intent(this,ForgotPassword::class.java)
            startActivity(intent)
        }
        GoToRegister_btn.setOnClickListener {
            val intent = Intent(this,UserRegistration::class.java)
            startActivity(intent)
        }

    }
}
