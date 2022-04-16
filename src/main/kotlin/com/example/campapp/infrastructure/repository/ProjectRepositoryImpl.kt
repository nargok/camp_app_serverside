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

    override fun register(project: Project) {
        crudEntity.new {
            title = project.title
            place = project.place
            start_date = project.startDate
            end_date = project.endDate
            memo = project.memo
        }
    }

    override fun update(project: Project) {
        val targetProject = crudEntity.findById(project.id)
        targetProject?.let {
            it.title = project.title
            it.place = project.place
            it.start_date = project.startDate
            it.end_date = project.endDate
            it.memo = project.memo
        }
    }

    override fun delete(id: Long) {
        val targetProject = crudEntity.findById(id)
        targetProject?.delete()
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