package com.example.student_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management_system.entities.Team;
import com.example.student_management_system.repositories.TeamRepository;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    public String deleteTeam(Long id) {
        teamRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public Team updateTeam(Long id, Team team) {
        Team existing = teamRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCreatedAt(team.getCreatedAt());
            existing.setTeamName(team.getTeamName());
            return teamRepository.save(existing);
        }
        return null;
    }
}
