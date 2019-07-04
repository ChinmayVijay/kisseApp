package com.example.kisseapp.repository

import com.example.kisseapp.database.StoryDao
import com.example.kisseapp.model.StoryModel

class StoryRepository(private val storyDao:StoryDao):IDBRepository<StoryModel> {
    override suspend fun insert(modelObject: StoryModel) {
        storyDao.insertStory(modelObject)
    }

    override suspend fun update(modelObject: StoryModel) {
        storyDao.updateStory(modelObject)
    }

    override suspend fun delete(modelObject: StoryModel) {
        storyDao.deleteStory(modelObject)
    }

    override suspend fun getAll(): List<StoryModel> {
        return storyDao.loadAllStory()
    }

    override suspend fun getById(id: Int): StoryModel {
        return storyDao.loadStoryById(id)
    }
}