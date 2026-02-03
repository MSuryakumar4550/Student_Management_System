package com.example.student_management_system.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String phone;
    private String profileImage;
    private Integer totalScore;
    private Boolean activeStatus;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
