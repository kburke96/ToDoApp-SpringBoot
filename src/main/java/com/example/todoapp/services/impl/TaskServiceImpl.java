package com.example.todoapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapp.repository.TaskRepository;
import com.example.todoapp.services.TaskService;
import com.example.todoapp.models.Task;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> findAll() {
		return taskRepository.findAll();
	}
	
	@Override
	public List<Task> findByStatus(String status) {
		return taskRepository.findByStatus(status);
	}
	
	public List<Task> findByTitle(String title) {
		return taskRepository.findByTitle(title);
	}
	
	@Override
	public Task addTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public Task findByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

}
