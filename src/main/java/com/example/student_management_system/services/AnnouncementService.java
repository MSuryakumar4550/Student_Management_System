package com.example.student_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management_system.entities.Announcement;
import com.example.student_management_system.repositories.AnnouncementRepository;

@Service
public class AnnouncementService {

    @Autowired
    private AnnouncementRepository announcementRepository;

    public Announcement addAnnouncement(Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    public List<Announcement> getAnnouncements() {
        return announcementRepository.findAll();
    }

    public String deleteAnnouncement(Long id) {
        announcementRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public Announcement updateAnnouncement(Long id, Announcement announcement) {
        Announcement existing = announcementRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCreatedAt(announcement.getCreatedAt());
            existing.setMessage(announcement.getMessage());
            existing.setTitle(announcement.getTitle());
            announcementRepository.save(existing);
        }
        return null;
    }
}
