package com.example.getthepill.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medications")
data class Medication(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val name : String,
    val dosage: Int,
    val totalCount : Int,
    val time : String
)
