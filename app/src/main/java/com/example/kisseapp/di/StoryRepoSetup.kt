package com.example.kisseapp.di

import com.example.kisseapp.repository.StoryRepository
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object StoryRepoSetup {
    private val storyRepoModule = module{
        single{ StoryRepository(get())}
    }

    fun init(){
        StoryDBSetup.init()
        loadKoinModules(storyRepoModule)
    }
}