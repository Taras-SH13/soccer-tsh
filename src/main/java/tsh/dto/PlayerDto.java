package tsh.dto;

public class PlayerDto {
    private final int id;
    private final String player_name;
    private final String player_position;
    private final String teamName;

    public PlayerDto(int id, String player_name, String player_position, String teamName) {
        this.id = id;
        this.player_name = player_name;
        this.player_position = player_position;
        this.teamName = teamName;
    }

    public int getId() {
        return id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public String getPlayer_position() {
        return player_position;
    }

    public String getTeamName() {
        return teamName;
    }
}
