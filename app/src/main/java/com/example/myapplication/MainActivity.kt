package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: NumberAdapter
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = NumberAdapter(this)
        viewPager2 = findViewById(R.id.pager)
        viewPager2.adapter = adapter
    }
}