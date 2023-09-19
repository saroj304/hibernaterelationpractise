package com.hibernateproject.serviceimpl;

import com.hibernateproject.models.Employee;
import com.hibernateproject.repository.EmployeeRepo;
import com.hibernateproject.service.EmployeeService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton

public class EmployeeServiceImpl implements EmployeeService {
    @Inject
    EmployeeRepo employeeRepo;


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}
