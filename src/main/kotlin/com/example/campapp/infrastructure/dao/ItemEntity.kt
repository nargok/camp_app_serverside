package com.example.campapp.infrastructure.dao
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.LongIdTable

object ItemTable : LongIdTable("item") {
    val name = varchar("name", 255)
    val weight = integer("weight")
}

class ItemEntity(id: EntityID<Long>) : LongEntity(id) {
   companion object : LongEntityClass<ItemEntity>(ItemTable)

   var name by ItemTable.name
   var weight by ItemTable.weight
}
