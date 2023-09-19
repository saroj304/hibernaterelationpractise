package com.hibernateproject.serviceimpl;

import com.hibernateproject.models.Department;
import com.hibernateproject.repository.DepartmentRepo;
import com.hibernateproject.service.DepartmentService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton

public class DepartmentServiceImpl implements DepartmentService {
    @Inject
    private DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department employee) {
        return departmentRepo.save(employee);
    }

    @Override
    public Department findByName(String rolename) {
        return departmentRepo.findByName(rolename);
    }
}