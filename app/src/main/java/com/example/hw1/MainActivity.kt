package com.example.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //list view
        val listView = findViewById<ListView>(R.id.student_info)
        val items = arrayOf(getString(R.string.name), getString(R.string.department), getString(R.string.year))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter
        //image view
        val profilePicture = findViewById<ImageView>(R.id.image_id)
        profilePicture.setImageResource(R.drawable.jumpmanlogo)
    }
}