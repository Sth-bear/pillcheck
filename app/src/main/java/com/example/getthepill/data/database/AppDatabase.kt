package com.example.getthepill.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.getthepill.data.model.Medication

@Database(entities = [Medication::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun medicationDao() : MedicationDao
}