package tsh.bd;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplayer", nullable = false)
    private int id;

    @Column(name = "player_name", nullable = false)
    private String player_name;

    @Column(name = "player_position", nullable = false)
    private String player_position;



    @Column(name ="team")
    private String teamName;


    public Player() {
    }

    public Player(int id, String player_name, String player_position,String teamName) {
        this.id = id;
        this.player_name = player_name;
        this.player_position = player_position;
        this.teamName=teamName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_position() {
        return player_position;
    }

    public void setPlayer_position(String player_position) {
        this.player_position = player_position;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", player_name='" + player_name + '\'' +
                ", player_position='" + player_position + '\'' +
                '}';
    }
}
