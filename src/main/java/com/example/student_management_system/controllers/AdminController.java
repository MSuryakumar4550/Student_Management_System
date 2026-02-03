package com.example.student_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_management_system.entities.Admin;
import com.example.student_management_system.services.AdminService;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }

    @GetMapping("/getAdmin")
    public List<Admin> getAdmin() {
        return adminService.getAdmins();
    }

    @DeleteMapping("/deleteAdmin/{id}")
    public String deleteAdmin(@RequestBody Long id, Admin admin) {
        return adminService.deleteAdmin(id, admin);
    }

    @PutMapping("/updateAdmin/{id}")
    public Admin updateAdmin(@RequestBody Long id, Admin admin) {
        return adminService.updateAdmin(id, admin);
    }
}
