package tsh.service;

import org.springframework.stereotype.Service;
import tsh.bd.Player;
import tsh.bd.PlayerRepository;
import tsh.bd.TeamRepository;
import tsh.converter.PlayerConverter;
import tsh.dto.PlayerDto;
import tsh.dto.TeamDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    public TeamService(TeamRepository teamRepository, PlayerRepository playerRepository) {
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    public List<PlayerDto> findAll() {

        return PlayerConverter.toPlayerDtoList(playerRepository.findAll());
    }

    public PlayerDto findPlayerById(Integer id) {
        Optional<Player> optionalPlayer = playerRepository.findById(id);
        return optionalPlayer.map(PlayerConverter::toPlayerDto).orElse(null);
    }

    public PlayerDto createPlayer(PlayerDto playerDto) {
        Player player = PlayerConverter.toPlayer(playerDto);
        Player savedplayer = playerRepository.save(player);
        return PlayerConverter.toPlayerDto(savedplayer);
    }

    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }
//    public List<PlayerDto> findAll() {
//
//        return PlayerConverter.toPlayerDtoList(playerRepository.findAll());
//    }
//
//    public PlayerDto findPlayerById(Integer id) {
//        Optional<Player> optionalPlayer = playerRepository.findById(id);
//        return optionalPlayer.map(PlayerConverter::toPlayerDto).orElse(null);
//    }
//
//    public TeamDto createTeam(TeamDto teamDto) {
//        Player player = PlayerConverter.toPlayer(playerDto);
//        Player savedplayer = playerRepository.save(player);
//        return PlayerConverter.toPlayerDto(savedplayer);
//    }
//
//    public void deleteTeam(Integer id) {
//        teamRepository.deleteById(id);
//    }
//
//
//public void checkcommand (){
//
//}

}


