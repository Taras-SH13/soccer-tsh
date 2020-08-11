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
                team.getCountry(),
                team.getCity(),
                PlayerConverter.toPlayerDtoList(team.getPlayers(team))
        );
    }

    public static List<TeamDto> toTeamDtoList(List<Team> teams) {
        return teams.stream().map(TeamConverter::toTeamDto).collect(Collectors.toList());
    }


    public static Team toTeam(TeamDto teamDto) {
        return new Team(teamDto.getIdteam(),
                teamDto.getTeam_name(),
                teamDto.getCountry(),
                teamDto.getCity(),
                teamDto.getPlayerDtos().stream().map(PlayerConverter::toPlayer).collect(Collectors.toList()));
    }
}


