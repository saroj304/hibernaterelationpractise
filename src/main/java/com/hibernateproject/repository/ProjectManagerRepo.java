package com.hibernateproject.repository;

import com.hibernateproject.models.ProjectManager;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import jakarta.inject.Singleton;

@Repository
@Singleton
public interface ProjectManagerRepo extends JpaRepository<ProjectManager,Integer> {
}
