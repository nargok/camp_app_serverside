package com.example.campapp.presentation.form

import com.example.campapp.domain.model.Project
import java.time.LocalDate

data class ProjectListResponse(val itemList: List<ProjectInfo>)

data class ProjectInfo(
    val id: Long,
    val title: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val memo: String
) {
    constructor(model: Project): this(model.id as Long, model.title, model.startDate, model.endDate, model.memo)
}