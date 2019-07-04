package com.example.kisseapp.di

import androidx.room.Room
import com.example.kisseapp.database.StoryDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object StoryDBSetup {

    private val storyDbModule = module {
        single { Room.databaseBuilder(androidApplication(),
            StoryDatabase::class.java,
            "story.db")
            .build()
        }
        factory { get<StoryDatabase>().getStoryDao() }
    }

    @JvmStatic
    fun init(){
        loadKoinModules(
            storyDbModule
        )
    }
}