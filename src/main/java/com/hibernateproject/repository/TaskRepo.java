package com.hibernateproject.repository;

import com.hibernateproject.models.Task;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
@Repository
public interface TaskRepo extends JpaRepository<Task,Integer> {
}
