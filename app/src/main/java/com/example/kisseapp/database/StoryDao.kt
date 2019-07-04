package com.example.kisseapp.database

import androidx.room.*
import com.example.kisseapp.model.StoryModel

@Dao
interface StoryDao {

    @Insert
    suspend fun insertStory(story:StoryModel)

    @Update
    suspend fun updateStory(story:StoryModel)

    @Delete
    suspend fun deleteStory(story:StoryModel)

    @Query("SELECT * FROM storyTable")
    suspend fun loadAllStory():List<StoryModel>

    @Query("SELECT * FROM storyTable WHERE id=:id")
    suspend fun loadStoryById(id:Int):StoryModel
}