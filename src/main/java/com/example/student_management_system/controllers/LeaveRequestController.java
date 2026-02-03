package com.example.student_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_management_system.entities.Leave;
import com.example.student_management_system.services.LeaveRequestService;

@RestController
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService leaveRequestService;

    @PostMapping("/addLeaveRequest")
    public Leave addLeaveRequest(@RequestBody Leave leave) {
        return leaveRequestService.addLeaveRequest(leave);
    }

    @GetMapping("/getLeaveRequest")
    public List<Leave> getLeaveRequest() {
        return leaveRequestService.getLeaveRequest();
    }

    @DeleteMapping("/deleteLeaveRequest/{id}")
    public String deleteLeave(@RequestBody Long id, Leave leave) {
        return leaveRequestService.deleteLeave(id, leave);
    }

    @PutMapping("/updateLeaveRequest/{id}")
    public Leave updateLeave(@RequestBody Long id, Leave leave) {
        return leaveRequestService.updateLeave(id, leave);
    }
}
