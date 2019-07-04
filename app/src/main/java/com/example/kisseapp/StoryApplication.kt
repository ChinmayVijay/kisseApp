package com.example.kisseapp

import android.app.Application
import com.example.kisseapp.di.StoryUISetup

class StoryApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        StoryUISetup.init(this)
    }
}