package com.example.student_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management_system.entities.Teacher;
import com.example.student_management_system.repositories.TeacherRepository;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public String deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public Teacher updateTeacher(Long id, Teacher teacher) {
        Teacher existing = teacherRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setActiveStatus(teacher.getActiveStatus());
            existing.setCreatedAt(teacher.getCreatedAt());
            existing.setEmail(teacher.getEmail());
            existing.setExperience(teacher.getExperience());
            existing.setName(teacher.getName());
            existing.setPassword(teacher.getPassword());
            existing.setPhone(teacher.getPhone());
            existing.setSubject(teacher.getSubject());
            return teacherRepository.save(existing);
        }
        return null;
    }
}
