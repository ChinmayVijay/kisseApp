package com.example.kisseapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kisseapp.R
import com.example.kisseapp.adapters.StoryViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter:StoryViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = StoryViewAdapter(this)
    }
}
