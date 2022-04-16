package com.example.campapp.application.service

import com.example.campapp.domain.model.Project
import com.example.campapp.domain.repository.ProjectRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProjectService(
    private val projectRepository: ProjectRepository
) {

    @Transactional
    fun getProjectList(): List<Project> {
        return projectRepository.getList()
    }

    @Transactional
    fun getProject(id: Long): Project? {
        return projectRepository.getProject(id)
    }

    @Transactional
    fun register(project: Project) {
        projectRepository.register(project)
    }

    @Transactional
    fun update(project: Project) {
        projectRepository.update(project)
    }

    @Transactional
    fun delete(id: Long) {
        projectRepository.delete(id)
    }

}