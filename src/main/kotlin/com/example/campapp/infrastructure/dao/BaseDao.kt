package com.example.campapp.infrastructure.dao

import org.jetbrains.exposed.sql.Database

abstract class BaseDao {
    fun createSessionFactory() {
        Database.connect(
            "jdbc:mysql://127.0.0.1:3306/exposed_example",
            driver = "com.mysql.cj.jdbc.Driver",
            user = "docker",
            password = "docker"
        )
    }
}