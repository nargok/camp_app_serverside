package com.example.campapp.infrastructure.dao

import com.example.campapp.domain.model.Member
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

//fun createSessionFactory() {
//    Database.connect(
//        "jdbc:mysql://127.0.0.1:3306/exposed_example",
//        driver = "com.mysql.cj.jdbc.Driver",
//        user = "docker",
//        password = "docker"
//    )
//}
//fun main() {
//    Database.connect(
//        "jdbc:mysql://127.0.0.1:3306/exposed_example",
//        driver = "com.mysql.cj.jdbc.Driver",
//        user = "docker",
//        password = "docker"
//    )
//
//    transaction {
//        addLogger(StdOutSqlLogger)
//
//        val member = MemberEntity.new {
//            name = "KotlinFromDAO"
//        }
//        println("Inserted id: ${member.id}")
//
//        MemberEntity.findById(member.id)?.let {
//            println("id: ${it.id}")
//            println("name: ${it.name}")
//        }
//    }
//}

