package com.hibernateproject.controller;

import com.hibernateproject.models.Department;
import com.hibernateproject.models.Employee;
import com.hibernateproject.service.DepartmentService;
import com.hibernateproject.service.EmployeeService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller
public class EmployeeController {
    @Inject
    EmployeeService employeeService;
    @Inject
    DepartmentService departmentService;

    @Post("/save_employee")
    public Employee saveEmployee() {
        Employee employee1 = new Employee();
        employee1.setName("rupesh");
        employee1.setAddress("kathamndu");
        employee1.setEmail("rupesh khatiwada1999@gmail.com");

        Department department = departmentService.findByName("backend");
        employee1.setDepartment(department);
        return employeeService.saveEmployee(employee1);
    }
}
