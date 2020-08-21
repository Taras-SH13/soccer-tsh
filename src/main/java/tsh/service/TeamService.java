package tsh.service;

import org.springframework.stereotype.Service;
import tsh.bd.Player;
import tsh.bd.PlayerRepository;
import tsh.bd.Team;
import tsh.bd.TeamRepository;
import tsh.converter.PlayerConverter;
import tsh.converter.TeamConverter;
import tsh.dto.PlayerDto;
import tsh.dto.TeamDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;


    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;

    }

    public TeamDto createTeam(TeamDto teamDto) {
        Team team = TeamConverter.toTeam(teamDto);
        Team savedteams = teamRepository.save(team);
        return TeamConverter.toTeamDto(savedteams);
    }

    public void deleteTeam(Integer id) {
        teamRepository.deleteById(id);
    }

    public List<TeamDto> findAllTeam() {
        return TeamConverter.toTeamDtoList(teamRepository.findAll());
    }

    public TeamDto findTeamById(Integer id) {
        Optional<Team> optionalTeam = teamRepository.findById(id);
        return optionalTeam.map(TeamConverter::toTeamDto).orElse(null);
    }


}


