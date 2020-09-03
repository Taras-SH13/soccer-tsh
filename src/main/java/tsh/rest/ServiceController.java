package tsh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tsh.dto.PlayerDto;
import tsh.dto.TeamDto;
import tsh.service.PlayerService;
import tsh.service.Service;
import tsh.service.TeamService;

import java.util.List;

@RestController
@RequestMapping(value = "service")

public class ServiceController {
    private final Service service;


    public ServiceController(Service service) {
        this.service = service;
    }

    @GetMapping(value = "{n}")
    public List<PlayerDto> findAllPlayersByTeamsName(@PathVariable(value = "n") Integer teamName) {
       return service.findAllPlayersByTeamsId(teamName);
    }

}
