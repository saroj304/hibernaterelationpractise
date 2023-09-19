package com.hibernateproject.service;

import com.hibernateproject.models.Department;

import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department employee);

    public Department findByName(String rolename);
}
