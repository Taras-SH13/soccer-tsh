package tsh.bd;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idteam", nullable = false)
    private int idteam;

    @Column(name = "team_name", nullable = false)
    private String team_name;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    @JoinColumn(name = "team")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Player> players;

    public Team() {
    }

    public Team(int idteam, String team_name, String country, String city, List<Player> players) {
        this.idteam = idteam;
        this.team_name = team_name;
        this.country = country;
        this.city = city;
        this.players = players;
    }

    public int getIdteam() {
        return idteam;
    }

    public void setIdteam(int idteam) {
        this.idteam = idteam;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Player> getPlayers(Team team) {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }


    @Override
    public String toString() {
        return "Team{" +
                "idteam=" + idteam +
                ", team_name='" + team_name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", players=" + players +
                '}';
    }
}
