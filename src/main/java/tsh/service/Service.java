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

    public List<PlayerDto> findAllPlayersByTeamsId(Integer idteam) {
        return PlayerConverter
                .toPlayerDtoList(playerRepository
                        .findAllByTeamsId(idteam));
    }
    public List<PlayerDto> findAllPlayersByTeamsName(String name) {
        return PlayerConverter
                .toPlayerDtoList(playerRepository
                        .findAllByTeam(name));
    }

    public void commandCheck(String teamName) {

        List<PlayerDto> teamList = findAllPlayersByTeamsName(teamName);
        Long count = teamList.stream().count();
        if(count>=11){
            System.out.printf("Command is full");
        }else System.out.println("Command is not full");
    }


}
