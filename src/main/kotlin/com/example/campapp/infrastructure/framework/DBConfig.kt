package com.example.campapp.infrastructure.framework

import org.jetbrains.exposed.spring.SpringTransactionManager
import org.jetbrains.exposed.sql.Database
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.transaction.annotation.TransactionManagementConfigurer
import javax.sql.DataSource

@Configuration
@EnableTransactionManagement
class DBConfig(@Autowired val dataSource: DataSource) : TransactionManagementConfigurer {
    init {
        Database.connect(dataSource)
    }
    @Bean
    override fun annotationDrivenTransactionManager() = SpringTransactionManager(dataSource)
}