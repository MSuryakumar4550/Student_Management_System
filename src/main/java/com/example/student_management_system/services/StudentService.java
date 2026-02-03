package com.example.student_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management_system.entities.Student;
import com.example.student_management_system.repositories.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public String deleteStudent(Long id, Student student) {
        studentRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public Student updateStudent(Long id, Student student) {
        Student existing = studentRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setActiveStatus(student.getActiveStatus());
            existing.setCreatedAt(student.getCreatedAt());
            existing.setName(student.getName());
            existing.setPassword(student.getPassword());
            existing.setPhone(student.getPhone());
            existing.setProfileImage(student.getProfileImage());
            existing.setTotalScore(student.getTotalScore());
            existing.setUpdatedAt(student.getUpdatedAt());
            return studentRepository.save(existing);
        }
        return null;
    }
}
