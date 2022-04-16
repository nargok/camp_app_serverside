package com.example.campapp.presentation.controller

import com.example.campapp.application.service.ProjectService
import com.example.campapp.domain.model.Project
import com.example.campapp.presentation.form.ProjectInfo
import com.example.campapp.presentation.form.ProjectListResponse
import com.example.campapp.presentation.form.ProjectRegisterRequest
import com.example.campapp.presentation.form.ProjectUpdateRequest
import org.springframework.web.bind.annotation.*

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

    @GetMapping("/{id}")
    fun getProject(@PathVariable("id") projectId: Long): ProjectInfo? {
        val targetProject = projectService.getProject(projectId)
        return targetProject?.let { ProjectInfo(it) }
    }

    @PostMapping("/register")
    fun register(@RequestBody request: ProjectRegisterRequest) {
        val dummyId = 9999L
        projectService.register(
            Project(
                dummyId,
                request.title,
                request.place,
                request.startDate,
                request.endDate,
                request.memo
            )
        )
    }

    @PutMapping("/update")
    fun update(@RequestBody request: ProjectUpdateRequest) {
        projectService.update(
            Project(
                request.id,
                request.title,
                request.place,
                request.startDate,
                request.endDate,
                request.memo
            )
        )
    }
}