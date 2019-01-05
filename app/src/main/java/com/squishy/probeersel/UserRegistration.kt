package com.squishy.probeersel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_user_registration.*

class UserRegistration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_registration)

        val context = this

        btn_insert.setOnClickListener {
            if (etvName.text.toString().length>0 &&
                    etvAge.text.toString().length > 0
                && etvEmail.text.toString().length > 0
            ){
                var user = User(etvName.text.toString(), etvAge.text.toString().toInt()
                    ,etvEmail.text.toString())
                var db = DataBaseHandler(context)
                db.insertData(user)
            }else{
                Toast.makeText(context, "Please Fill in completely to register", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
