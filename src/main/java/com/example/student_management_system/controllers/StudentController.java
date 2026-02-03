package com.example.student_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.student_management_system.entities.Student;
import com.example.student_management_system.services.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudent")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@RequestBody Long id, Student student) {
        return studentService.deleteStudent(id, student);
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Long id, Student student) {
        return studentService.updateStudent(id, student);
    }
}
