package com.example.student_management_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_management_system.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
