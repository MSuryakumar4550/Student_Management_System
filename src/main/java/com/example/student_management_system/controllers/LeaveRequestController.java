package com.example.student_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_management_system.entities.LeaveRequest;
import com.example.student_management_system.services.LeaveRequestService;

@RestController
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService leaveRequestService;

    @PostMapping("/addLeaveRequest")
    public LeaveRequest addLeaveRequest(@RequestBody LeaveRequest leave) {
        return leaveRequestService.addLeaveRequest(leave);
    }

    @GetMapping("/getLeaveRequest")
    public List<LeaveRequest> getLeaveRequest() {
        return leaveRequestService.getLeaveRequest();
    }

    @DeleteMapping("/deleteLeaveRequest/{id}")
    public String deleteLeave(@PathVariable Long id) {
        return leaveRequestService.deleteLeave(id);
    }

    @PutMapping("/updateLeaveRequest/{id}")
    public LeaveRequest updateLeave(@PathVariable Long id, @RequestBody LeaveRequest leave) {
        return leaveRequestService.updateLeave(id, leave);
    }
}
