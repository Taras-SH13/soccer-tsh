package tsh.dto;

import java.util.List;

public class TeamDto {

    private final int idteam;
    private final String team_name;
    private final String country;
    private final String city;
    private final List<PlayerDto> playerDtos;



    public TeamDto(int idteam, String team_name, String country, String city, List<PlayerDto> playerDtos) {
        this.idteam = idteam;
        this.team_name = team_name;
        this.country = country;
        this.city = city;
        this.playerDtos = playerDtos;
    }

    public int getIdteam() {
        return idteam;
    }

    public String getTeam_name() {
        return team_name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public List<PlayerDto> getPlayerDtos() {
        return playerDtos;
    }
}
