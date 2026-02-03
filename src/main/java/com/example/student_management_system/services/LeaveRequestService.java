package com.example.student_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management_system.entities.Leave;
import com.example.student_management_system.repositories.LeaveRequestRepository;

@Service
public class LeaveRequestService {

    @Autowired
    private LeaveRequestRepository leaveRequestRepository;

    public Leave addLeaveRequest(Leave leave) {
        return leaveRequestRepository.save(leave);
    }

    public List<Leave> getLeaveRequest() {
        return leaveRequestRepository.findAll();
    }

    public String deleteLeave(Long id, Leave leave) {
        leaveRequestRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public Leave updateLeave(Long id, Leave leave) {
        Leave existing = leaveRequestRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setAppliedDate(leave.getAppliedDate());
            existing.setFromDate(leave.getFromDate());
            existing.setReason(leave.getReason());
            existing.setStatus(leave.getStatus());
            existing.setStudentId(leave.getStudentId());
            existing.setTeacherId(leave.getTeacherId());
            existing.setToDate(leave.getToDate());
            return leaveRequestRepository.save(existing);
        }
        return null;
    }

}
