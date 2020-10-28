package com.example.todoapp.services;

import java.util.List;

import com.example.todoapp.models.Task;

public interface TaskService {
	
	public List<Task> findAll();
	public List<Task> findByStatus(String status);
	public Task findByDescription(String description);
	
	Task updateTask(Task task);
	

}
