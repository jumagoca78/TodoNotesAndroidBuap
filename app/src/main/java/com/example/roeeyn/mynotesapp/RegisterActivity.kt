package com.example.roeeyn.mynotesapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.content_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSupportActionBar(toolbar)

        btn_new_register.setOnClickListener {

            val newUser = et_new_user.text.toString()
            val newPswd = et_new_pswd.text.toString()
            registerUser(newUser, newPswd)

        }

    }

    private fun registerUser(newUser:String, newPswd:String){

        tostado("$newUser creado")
        finish()

    }

}
