package com.example.student_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.student_management_system.entities.Team;
import com.example.student_management_system.services.TeamService;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/addTeam")
    public Team addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @GetMapping("/getTeam")
    public List<Team> getTeams() {
        return teamService.getTeams();
    }

    @DeleteMapping("/deleteTeam/{id}")
    public String deleteTeam(@RequestBody Long id, Team team) {
        return teamService.deleteTeam(id, team);
    }

    @PutMapping("/updateTeam/{id}")
    public Team updateTeam(@RequestBody Long id, Team team) {
        return teamService.updateTeam(id, team);
    }
}
