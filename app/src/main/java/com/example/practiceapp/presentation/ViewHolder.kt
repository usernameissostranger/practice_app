package com.example.practiceapp.presentation

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapp.R

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val titleTextView: TextView = view.findViewById(R.id.titleTextView)
    val codeLabelTextView: TextView = view.findViewById(R.id.codeLabelTextView)
    val codeTextView: TextView = view.findViewById(R.id.codeTextView)
    val priceTextView: TextView = view.findViewById(R.id.priceTextView)
    val unitTextView: TextView = view.findViewById(R.id.unitTextView)
}