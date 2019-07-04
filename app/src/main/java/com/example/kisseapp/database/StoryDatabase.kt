package com.example.kisseapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.kisseapp.model.StoryModel
import com.example.kisseapp.utils.DateTimeConverter

@Database(
    entities = [StoryModel::class],
    version =1,
    exportSchema = false
)
@TypeConverters(DateTimeConverter::class)
abstract class StoryDatabase: RoomDatabase() {

    abstract fun getStoryDao():StoryDao

}