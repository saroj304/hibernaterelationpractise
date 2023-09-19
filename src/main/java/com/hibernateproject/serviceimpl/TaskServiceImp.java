package com.hibernateproject.serviceimpl;

import com.hibernateproject.models.Task;
import com.hibernateproject.repository.TaskRepo;
import com.hibernateproject.service.TaskService;
import jakarta.inject.Inject;

import java.util.List;

public class TaskServiceImp implements TaskService {
   @Inject
   TaskRepo taskRepo;
    @Override
    public List<Task> saveTask(List<Task> t) {
        return taskRepo.saveAll(t);
    }
}
