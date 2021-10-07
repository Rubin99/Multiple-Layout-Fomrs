package com.example.form.RecyclerView

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.form.R

class TestViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
    val profileIV: ImageView = itemView.findViewById(R.id.profileIV)
    val nameTV: TextView = itemView.findViewById(R.id.nameTV)
    val emailTV: TextView = itemView.findViewById(R.id.emailTV)
    val ageTV: TextView = itemView.findViewById(R.id.ageTV)
}
