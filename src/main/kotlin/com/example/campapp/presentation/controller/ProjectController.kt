package com.example.campapp.presentation.controller

import com.example.campapp.application.service.ProjectService
import com.example.campapp.presentation.form.ProjectInfo
import com.example.campapp.presentation.form.ProjectListResponse
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("project")
@CrossOrigin
class ProjectController(
    private val projectService: ProjectService
) {

    @GetMapping("/list")
    fun getList(): ProjectListResponse {
        val projectList = projectService.getProjectList().map {
            ProjectInfo(it)
        }

        return ProjectListResponse(projectList)
    }
}