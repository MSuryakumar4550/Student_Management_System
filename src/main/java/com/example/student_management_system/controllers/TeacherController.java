package com.example.student_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.student_management_system.entities.Teacher;
import com.example.student_management_system.services.TeacherService;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    @GetMapping("/getTeacher")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public String deleteTeacher(@RequestBody Long id, Teacher teacher) {
        return teacherService.deleteTeacher(id, teacher);
    }

    @PutMapping("/updateTeacher/{id}")
    public Teacher updateTeacher(@RequestBody Long id, Teacher teacher) {
        return teacherService.updateTeacher(id, teacher);
    }
}
