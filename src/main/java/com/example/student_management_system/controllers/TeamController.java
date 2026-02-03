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
    public String deleteTeam(@PathVariable Long id) {
        return teamService.deleteTeam(id);
    }

    @PutMapping("/updateTeam/{id}")
    public Team updateTeam(@PathVariable Long id, @RequestBody Team team) {
        return teamService.updateTeam(id, team);
    }
}
