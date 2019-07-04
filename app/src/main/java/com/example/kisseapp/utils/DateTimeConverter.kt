package com.example.kisseapp.utils

import androidx.room.TypeConverter
import java.util.*

class DateTimeConverter {

    @TypeConverter
    fun fromDate(timeStamp: Date):Long{
        return timeStamp.time
    }

    @TypeConverter
    fun toDate(timeStamp: Long):Date{
        return Date(timeStamp)
    }
}