package com.example.campapp.infrastructure.repository

import com.example.campapp.domain.model.Project
import com.example.campapp.domain.repository.ProjectRepository
import com.example.campapp.infrastructure.dao.ProjectEntity
import org.springframework.stereotype.Repository

@Repository
class ProjectRepositoryImpl: ProjectRepository {
    private val crudEntity = ProjectEntity

    override fun getList(): List<Project> {
       return crudEntity.all().map { toModel(it) }
    }

    override fun getProject(id: Long): Project? {
        val targetProject = crudEntity.findById(id)
        return targetProject?.let { toModel(it) }
    }

    override fun register() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    private fun toModel(entity: ProjectEntity): Project {
        return Project(
            id = entity.id.value,
            title = entity.title,
            place = entity.place,
            startDate = entity.start_date,
            endDate = entity.end_date,
            memo = entity.memo
        )
    }
}