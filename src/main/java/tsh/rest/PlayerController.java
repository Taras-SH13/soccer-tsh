package tsh.rest;

import org.springframework.web.bind.annotation.*;
import tsh.dto.PlayerDto;
import tsh.service.PlayerService;
import tsh.service.TeamService;

import java.util.List;

@RestController
@RequestMapping(value = "players")
public class PlayerController {


    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<PlayerDto> findAll() {
        return playerService.findAll();
    }

    @PostMapping
    public PlayerDto createPlayer(@RequestBody PlayerDto player) {
        return playerService.createPlayer(player);
    }

    @GetMapping(value = "{id}")
    public PlayerDto findPlayerById(@PathVariable(value = "id") Integer id) {

        return playerService.findPlayerById(id);
    }

    @DeleteMapping(value = "{id}")
    public void deletePlayer(@PathVariable(value = "id") Integer id) {
        playerService.deletePlayer(id);
    }

}

