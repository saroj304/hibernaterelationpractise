package com.hibernateproject.controller;

import com.hibernateproject.models.Department;
import com.hibernateproject.models.Employee;
import com.hibernateproject.serviceimpl.DepartmentServiceImpl;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DepartmentController {
    @Inject
    DepartmentServiceImpl departmentService;

    List<Employee> employeeList = new ArrayList<>();

    @Post("/save_department")
    @Produces
    public Department saveEmployeeData() {
        Department department1 = new Department();
        department1.setName("frontend");
        //add the employees in this list
        //call the controller method to save the data
        return departmentService.saveDepartment(department1);
    }

}
