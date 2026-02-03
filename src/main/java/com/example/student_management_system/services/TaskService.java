package com.example.student_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management_system.entities.Task;
import com.example.student_management_system.repositories.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public String deleteTask(Long id, Task task) {
        taskRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public String updateTask(Long id, Task task) {
        Task existing = taskRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setAssignedDate(task.getAssignedDate());
            existing.setCompletedDate(task.getCompletedDate());
            existing.setDeadline(task.getDeadline());
            existing.setDescription(task.getDescription());
            existing.setMarks(task.getMarks());
            existing.setPriority(task.getPriority());
            existing.setStatus(task.getStatus());
            existing.setTitle(task.getTitle());
            taskRepository.save(existing);
            return "Details updated successfully.";
        }
        return "Data does not exist";

    }

}
