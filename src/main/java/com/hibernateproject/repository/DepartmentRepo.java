package com.hibernateproject.repository;

import com.hibernateproject.models.Department;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import jakarta.inject.Singleton;

import java.util.Optional;

@Repository
@Singleton
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

    Department findByName(String name);
}
