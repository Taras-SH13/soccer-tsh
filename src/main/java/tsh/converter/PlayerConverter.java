package tsh.converter;

import tsh.bd.Player;
import tsh.dto.PlayerDto;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerConverter {

    public static PlayerDto toPlayerDto(Player player) {
        return new PlayerDto(player.getId(), player.getPlayer_name(), player.getPlayer_position());
    }

    public static List<PlayerDto> toPlayerDtoList(List<Player> players) {
        return players.stream().map(PlayerConverter::toPlayerDto).collect(Collectors.toList());
    }


    public static Player toPlayer(PlayerDto playerDto) {
        return new Player(playerDto.getId(), playerDto.getPlayer_name(), playerDto.getPlayer_position());
    }
}