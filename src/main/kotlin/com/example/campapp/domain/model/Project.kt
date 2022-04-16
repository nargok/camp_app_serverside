package com.example.campapp.domain.model

import java.time.LocalDate

data class Project(
    val id: Long,
    val title: String,
    val place: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val memo: String
)
