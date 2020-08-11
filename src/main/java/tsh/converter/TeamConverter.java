package tsh.converter;

import tsh.bd.Player;
import tsh.bd.Team;
import tsh.dto.PlayerDto;
import tsh.dto.TeamDto;

import java.util.List;
import java.util.stream.Collectors;

public class TeamConverter {


       public static TeamDto toTeamDto(Team team) {
            return new TeamDto(
                    team.getIdteam(),
                    team.getTeam_name(),
                    team.getCity(),
PlayerConverter.toPlayerDtoList(team.getPlayers(team))
            );
        }

        public static List<PlayerDto> toPlayerDtoList(List<Player> players) {
            return players.stream().map(tsh.converter.PlayerConverter::toPlayerDto).collect(Collectors.toList());
        }


        public static Player toPlayer(PlayerDto playerDto) {
            return new Player(playerDto.getId(), playerDto.getPlayer_name(), playerDto.getPlayer_position());
        }
}


