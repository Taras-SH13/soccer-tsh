package tsh.service;

import tsh.bd.PlayerRepository;
import tsh.bd.TeamRepository;
import tsh.converter.PlayerConverter;
import tsh.dto.PlayerDto;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    public Service(TeamRepository teamRepository, PlayerRepository playerRepository) {
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    public List<PlayerDto>findByIdteam(Integer id){
        return PlayerConverter.toPlayerDtoList(teamRepository.findByIdteam(id));
    }





}
