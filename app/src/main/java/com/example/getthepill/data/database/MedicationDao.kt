package com.example.getthepill.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.getthepill.data.model.Medication

@Dao
interface MedicationDao {
    @Query("SELECT * FROM medications")
    fun getAllMedications(): LiveData<List<Medication>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMedication(medication: Medication)

    @Delete
    suspend fun deleteMedication(medication: Medication)
}