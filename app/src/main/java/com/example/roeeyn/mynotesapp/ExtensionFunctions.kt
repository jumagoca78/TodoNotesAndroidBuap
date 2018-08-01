package com.example.roeeyn.mynotesapp

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.tostado(mensaje:String) = Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()