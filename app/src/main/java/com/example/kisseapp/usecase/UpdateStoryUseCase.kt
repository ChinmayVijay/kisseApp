package com.example.kisseapp.usecase

import com.example.kisseapp.model.StoryModel

class UpdateStoryUseCase : UseCase<StoryModel, Unit>() {
    override suspend fun execute(request: StoryModel) {
    }
}