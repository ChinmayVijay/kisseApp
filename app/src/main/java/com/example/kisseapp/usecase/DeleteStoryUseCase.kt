package com.example.kisseapp.usecase

import com.example.kisseapp.model.StoryModel

class DeleteStoryUseCase: UseCase<StoryModel, Unit>() {
    override suspend fun execute(request: StoryModel) {

    }
}