package com.example.student_management_system.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String subject;
    private Integer experience;
    private Boolean activeStatus;
    private LocalDateTime createdAt;
}
