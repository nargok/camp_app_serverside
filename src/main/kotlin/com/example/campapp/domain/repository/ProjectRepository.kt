package com.example.campapp.domain.repository

import com.example.campapp.domain.model.Project

interface ProjectRepository {
    fun getList(): List<Project>

    fun getProject(id: Long): Project?

    fun register()

    fun update()

    fun delete()
}