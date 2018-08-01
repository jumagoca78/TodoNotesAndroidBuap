package com.example.roeeyn.mynotesapp

import android.os.Bundle
import android.widget.LinearLayout.VERTICAL
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_notes.*
import kotlinx.android.synthetic.main.content_notes.*

class NotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        setSupportActionBar(toolbar)

        setupRecyclerview()

    }

    fun setupRecyclerview(){

        val layoutManager = LinearLayoutManager(this, VERTICAL, false)
        val adapter = NotesAdapter(getSampleNotes()){

            tostado(it.toString())

        }

        rv_main.adapter = adapter
        rv_main.layoutManager = layoutManager

    }

    fun getSampleNotes():List<Note> = listOf(
            Note("Ir a la BUAP", "Entrar a mis clases"),
            Note("Lavar la cocina", "Que quede limpia"),
            Note("Sacar al perro", "Que se canse")
    )

}
