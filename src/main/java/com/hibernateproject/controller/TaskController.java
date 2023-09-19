package com.hibernateproject.controller;

import com.hibernateproject.models.Department;
import com.hibernateproject.models.Task;
import com.hibernateproject.service.DepartmentService;
import com.hibernateproject.service.TaskService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import org.hibernate.resource.transaction.spi.DdlTransactionIsolator;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {
    @Inject
    TaskService taskService;
    @Inject
    DepartmentService departmentService;

    @Post("/save_task")
    public List<Task> saveTask() {
        // add  list of tasks to one department to show....//@manytoone relation
        Department department = departmentService.findByName("backend");
        List<Task> listoftask = new ArrayList<>();
        Task t1 = new Task();
        t1.setName("Ecommerce");
        //set the deadline for the task
        t1.setDateTime(LocalDateTime.of(2023, 12, 14, 10, 34));
        t1.setDepartment(department);

        Task t2 = new Task();
        t2.setName("Investment platform");
        //set the deadline for the task
        t2.setDateTime(LocalDateTime.of(2023, 10, 14, 10, 34));
        t2.setDepartment(department);
        //now add the task on the list of task
        listoftask.add(t1);
        listoftask.add(t2);


        return taskService.saveTask(listoftask);
    }
}
