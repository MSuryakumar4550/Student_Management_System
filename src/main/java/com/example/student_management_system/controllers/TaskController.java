package com.example.student_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.student_management_system.entities.Task;
import com.example.student_management_system.services.TaskService;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @GetMapping("/getTask")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @DeleteMapping("/deleteTask/{id}")
    public String deleteTask(@RequestBody Long id, Task task) {
        return taskService.deleteTask(id, task);
    }

    @PutMapping("/updateTask/{id}")
    public String updateTask(@RequestBody Long id, Task task) {
        return taskService.updateTask(id, task);
    }
}
