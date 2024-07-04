package com.example.practiceapp.presentation

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapp.R

class RecyclerViewAdapter(private val names: List<ClipData.Item>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = names[position]
        holder.titleTextView.text = data.toString()
        holder.codeTextView.text = data.toString()
        holder.priceTextView.text = data.toString()
        holder.unitTextView.text = data.toString()
    }

    override fun getItemCount(): Int = names.size
}