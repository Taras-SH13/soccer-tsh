package tsh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tsh.dto.PlayerDto;
import tsh.dto.TeamDto;
import tsh.service.PlayerService;
import tsh.service.TeamService;

import java.util.List;

@RestController
@RequestMapping(value = "s")

public class ServiceController {
    private final PlayerService playerService;
    private final TeamService teamService;

    public ServiceController(PlayerService playerService, TeamService teamService) {
        this.playerService = playerService;
        this.teamService = teamService;
    }

    @GetMapping(value = "{team}")
    public List<PlayerDto> findAllPlayersByTeamsId(@PathVariable(value = "team") Integer team) {

        return playerService.findAllPlayersByTeamsId(team);
    }

}
