package com.example.form.RecyclerView

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.form.R

class TestViewHolder(private val itemView: View, private val onViewClicked: (position: Int) -> Unit)
    : RecyclerView.ViewHolder(itemView) {
    val profileIV: ImageView = itemView.findViewById(R.id.profileIV)
    val nameTV: TextView = itemView.findViewById(R.id.nameTV)
    val emailTV: TextView = itemView.findViewById(R.id.emailTV)
    val ageTV: TextView = itemView.findViewById(R.id.ageTV)
    val viewBtn: Button = itemView.findViewById(R.id.viewBtn)

    init {
        viewBtn.setOnClickListener {
            onViewClicked(adapterPosition)
        }
    }
}
