package com.example.roeeyn.mynotesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_note.view.*

class NotesAdapter(private val notesList:List<Note>
                   , private val onClick: (Note) -> Unit)
    :RecyclerView.Adapter<NotesAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : MyViewHolder {

        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_note, parent, false)

        return MyViewHolder(itemView)

    }

    override fun getItemCount(): Int = notesList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =
            holder.onBindView(notesList[position], onClick)

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun onBindView(note: Note, onClick: (Note) -> Unit) =
                with(itemView) {

                    item_title.text = note.title
                    item_description.text = note.description
                    item_title.setOnClickListener { onClick(note) }

                }


    }

}

data class Note(val title: String, val description: String)