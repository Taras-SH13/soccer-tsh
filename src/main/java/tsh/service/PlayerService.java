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
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
// CRUD operations
    public List<PlayerDto> findAll() {

        return PlayerConverter.toPlayerDtoList(playerRepository.findAll());
    }
    // CRUD operations
    public PlayerDto findPlayerById(Integer idplayer) {
        Optional<Player> optionalPlayer = playerRepository.findById(idplayer);
        return optionalPlayer.map(PlayerConverter::toPlayerDto).orElse(null);
    }
    // CRUD operations
    public PlayerDto createPlayer(PlayerDto playerDto) {
        Player player = PlayerConverter.toPlayer(playerDto);
        Player savedplayer = playerRepository.save(player);
        return PlayerConverter.toPlayerDto(savedplayer);
    }
    // CRUD operations
    public void deletePlayer(Integer idplayer) {
        playerRepository.deleteById(idplayer);
    }


    // CRUD operations
    public PlayerDto findPlayerByName(String name) {
        return PlayerConverter.toPlayerDto(playerRepository.findPlayersByPlayer_name(name));
    }
}




