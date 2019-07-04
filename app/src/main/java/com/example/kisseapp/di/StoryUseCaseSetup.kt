package com.example.kisseapp.di

import com.example.kisseapp.usecase.AddStoryUseCase
import com.example.kisseapp.usecase.DeleteStoryUseCase
import com.example.kisseapp.usecase.UpdateStoryUseCase
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object StoryUseCaseSetup {
    private val storyUseCaseModule = module{
        single{
            single{AddStoryUseCase()}
            single{ UpdateStoryUseCase() }
            single{ DeleteStoryUseCase() }
        }
    }

    @JvmStatic
    fun init(){

        //Call Repo setup
        StoryRepoSetup.init()
        loadKoinModules(
            storyUseCaseModule
        )
    }
}