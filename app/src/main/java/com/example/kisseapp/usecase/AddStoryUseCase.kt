package com.example.kisseapp.usecase

import com.example.kisseapp.model.StoryModel

class AddStoryUseCase() : UseCase<StoryModel, Unit>() {
    override suspend fun execute(request: StoryModel) {

    }
}