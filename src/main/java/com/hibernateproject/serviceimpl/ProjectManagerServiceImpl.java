package com.hibernateproject.serviceimpl;

import com.hibernateproject.models.ProjectManager;
import com.hibernateproject.repository.ProjectManagerRepo;
import com.hibernateproject.service.ProjectManagerService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ProjectManagerServiceImpl implements ProjectManagerService {
    @Inject
    ProjectManagerRepo projectManagerRepo;
    @Override
    public ProjectManager saveProjectManager(ProjectManager projectManager) {
        return  projectManagerRepo.save(projectManager);
    }
}
