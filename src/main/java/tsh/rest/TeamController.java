package tsh.rest;

import org.springframework.web.bind.annotation.*;
import tsh.bd.Player;
import tsh.bd.Team;
import tsh.bd.TeamRepository;
import tsh.converter.PlayerConverter;
import tsh.converter.TeamConverter;
import tsh.dto.PlayerDto;
import tsh.dto.TeamDto;
import tsh.service.TeamService;

import java.util.List;

@RestController
@RequestMapping(value = "teams")
public class TeamController {


    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<TeamDto> findAllTeam() {
        return teamService.findAllTeam();
    }

    @PostMapping
    public TeamDto createTeam(@RequestBody TeamDto team) {
        return teamService.createTeam(team);
    }

    @GetMapping(value = "{id}")
    public TeamDto findTeamById(@PathVariable(value = "id") Integer id) {
        return teamService.findTeamById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteTeam(@PathVariable(value = "id") Integer id) {
        teamService.deleteTeam(id);
    }



}
