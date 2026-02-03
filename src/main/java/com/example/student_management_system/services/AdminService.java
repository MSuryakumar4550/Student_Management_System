package com.example.student_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management_system.entities.Admin;
import com.example.student_management_system.repositories.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }

    public String deleteAdmin(Long id, Admin admin) {
        adminRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public Admin updateAdmin(Long id, Admin admin) {
        Admin existing = adminRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCreatedAt(admin.getCreatedAt());
            existing.setEmail(admin.getEmail());
            existing.setName(admin.getName());
            existing.setPassword(admin.getPassword());
            existing.setRole(admin.getRole());
            adminRepository.save(existing);
        }
        return null;
    }
}
