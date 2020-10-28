package com.example.todoapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.todoapp.models.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String>{
	List<Task> findByDescription(String description);
	List<Task> findByStatus(String status);
	List<Task> findByTitle(String title);

}
