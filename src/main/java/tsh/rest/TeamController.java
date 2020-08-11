package tsh.rest;

import org.springframework.web.bind.annotation.*;
import tsh.bd.Player;
import tsh.dto.PlayerDto;
import tsh.service.TeamService;

import java.util.List;

@RestController
@RequestMapping(value = "players")
public class TeamController {


    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<PlayerDto> findAll() {
        return teamService.findAll();
    }
    @PostMapping
    public PlayerDto createPlayer(@RequestBody PlayerDto player) {
        return teamService.createPlayer(player);
    }
    @GetMapping(value = "{id}")
    public PlayerDto findById(@PathVariable(value = "id") Integer id) {
        return teamService.findPlayerById(id);
    }
    @DeleteMapping(value = "{id}")
    public void deletePlayer(@PathVariable(value = "id") Integer id) {
        teamService.deletePlayer(id);
    }
}
