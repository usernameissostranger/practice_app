package com.example.practiceapp.presentation

import android.content.ClipData.*
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = listOf(
            Item("Title 1", "Description 1"),
            Item("Title 2", "Description 2"),
            Item("Title 3", "Description 3")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val adapter = RecyclerViewAdapter(itemList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}