package com.example.getthepill.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.getthepill.data.model.Medication
import com.example.getthepill.data.repository.MedicationRepository

class MainViewModel(private val repository: MedicationRepository) : ViewModel() {
    val medications: LiveData<List<Medication>> = repository.allMedications
}