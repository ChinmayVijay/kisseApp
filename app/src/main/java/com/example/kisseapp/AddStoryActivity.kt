package com.example.kisseapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kisseapp.ui.addstory.AddStoryFragment

class AddStoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_story_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AddStoryFragment.newInstance())
                .commitNow()
        }
    }

}
