package com.example.kisseapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kisseapp.model.StoryModel
import com.example.kisseapp.usecase.StoryViewUseCase
import com.example.kisseapp.usecase.invoke
import kotlinx.coroutines.launch

class MainViewModel(private val storyViewUseCase: StoryViewUseCase) : ViewModel() {

    private val storyState = MutableLiveData<List<StoryModel>>()
    val storyList: LiveData<List<StoryModel>>
    get() = storyState


    fun getAllStories(){
        viewModelScope.launch {
             storyViewUseCase.invoke()
        }
    }


}