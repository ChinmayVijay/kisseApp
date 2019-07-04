package com.example.kisseapp.di

import android.content.Context
import com.example.kisseapp.ui.addstory.AddStoryViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.dsl.module

object StoryUISetup {
    private val storyUIModule = module{
        single{AddStoryViewModel()}
    }

    @JvmStatic
    fun init(appContext: Context){
        startKoin {
            androidContext(appContext)
        }
        StoryUseCaseSetup.init()
        loadKoinModules(
            storyUIModule
        )


    }
}