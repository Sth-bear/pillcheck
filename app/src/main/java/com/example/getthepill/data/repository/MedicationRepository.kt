package com.example.getthepill.data.repository

import androidx.lifecycle.LiveData
import com.example.getthepill.data.database.MedicationDao
import com.example.getthepill.data.model.Medication

class MedicationRepository(private val dao : MedicationDao) {
    val allMedications: LiveData<List<Medication>> = dao.getAllMedications()

    suspend fun insert(medication: Medication) = dao.insertMedication(medication)
    suspend fun delete(medication: Medication) = dao.deleteMedication(medication)
}