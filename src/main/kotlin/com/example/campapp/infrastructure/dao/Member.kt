package com.example.campapp.infrastructure.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.LongIdTable

object MemberTable : LongIdTable("member") {
    val name = varchar("name", 32)
}

class MemberEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<MemberEntity>(MemberTable)

    var name by MemberTable.name
}
