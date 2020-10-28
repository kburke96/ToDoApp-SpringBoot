package com.example.todoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.models.Task;
import com.example.todoapp.services.TaskService;
import com.example.todoapp.services.impl.TaskServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	TaskServiceImpl taskService;
	
	@GetMapping("/findAll")
	public List<Task> findAllTasks() {
		return taskService.findAll();
	}
	
	
	@GetMapping("/home")
	public String home(Model model) {
		//System.out.println(taskService.findAll());
		List<Task> allTasks = taskService.findAll();
		List<Task> todoTasks = taskService.findByStatus("To Do");
		List<Task> inprogressTasks = taskService.findByStatus("In Progress");
		List<Task> doneTasks = taskService.findByStatus("Done");
		model.addAttribute("todoTasks",todoTasks);
		model.addAttribute("inprogressTasks",inprogressTasks);
		model.addAttribute("doneTasks",doneTasks);
		return "home";
	}

}
