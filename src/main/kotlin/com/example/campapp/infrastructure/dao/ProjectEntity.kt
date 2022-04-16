package com.example.campapp.infrastructure.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.`java-time`.date


object ProjectTable : LongIdTable("project") {
    val title = varchar("name", 255)
    val place = varchar("name", 255)
    val start_date = date("start_date")
    val end_date = date("end_date")
    val memo = text("memo")
}

class ProjectEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<ProjectEntity>(ProjectTable)

    var title by ProjectTable.title
    var place by ProjectTable.place
    var start_date by ProjectTable.start_date
    var end_date by ProjectTable.end_date
    var memo by ProjectTable.memo
}
