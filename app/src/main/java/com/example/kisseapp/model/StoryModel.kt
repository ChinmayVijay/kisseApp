package com.example.kisseapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "storyTable")
data class StoryModel(

    @PrimaryKey(autoGenerate = true)
    private val id:Int,

    @ColumnInfo(name = "title")
    val title: String?,
    @ColumnInfo(name = "description")
    val description:String?,
    @ColumnInfo(name = "size")
    val size:Long?,
    @ColumnInfo(name = "posterPath")
    val posterPath:String?,
    @ColumnInfo(name = "updatedDate")
    val updatedDate: Date,
    @ColumnInfo(name = "plot")
    val plot:String?,
    @ColumnInfo(name = "characterOneFile")
    val characterOneFile:String?,
    @ColumnInfo(name = "characterTwoFile")
    val characterTwoFile:String?,
    @ColumnInfo(name = "characterThreeFile")
    val characterThreeFile:String?
                      )