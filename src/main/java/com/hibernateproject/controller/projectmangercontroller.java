package com.hibernateproject.controller;

import com.hibernateproject.models.Department;
import com.hibernateproject.models.ProjectManager;
import com.hibernateproject.service.DepartmentService;
import com.hibernateproject.service.ProjectManagerService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller
public class projectmangercontroller {
    @Inject
    ProjectManagerService projectManagerService;
    @Inject
    DepartmentService departmentService;

    @Post("/save_projectmanager")
    public ProjectManager saveProjectManager() {
        Department department = departmentService.findByName("frontend");
        ProjectManager projectManager = new ProjectManager();
        projectManager.setName("ram prasad khatiwada");
        //set the project manager onto the department specified above
        projectManager.setDepartment(department);
        return projectManagerService.saveProjectManager(projectManager);
    }
}

