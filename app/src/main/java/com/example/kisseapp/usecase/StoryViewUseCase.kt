package com.example.kisseapp.usecase

import com.example.kisseapp.model.StoryModel
import com.example.kisseapp.repository.StoryRepository

class StoryViewUseCase(private val storyRepository: StoryRepository) : UseCase<Unit,List<StoryModel>>() {

    override suspend fun execute(request: Unit): List<StoryModel> {
        return storyRepository.getAll()
    }

}