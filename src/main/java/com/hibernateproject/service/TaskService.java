package com.hibernateproject.service;

import com.hibernateproject.models.Task;

import java.util.List;

public interface TaskService {
    List<Task> saveTask(List<Task> t);
}
