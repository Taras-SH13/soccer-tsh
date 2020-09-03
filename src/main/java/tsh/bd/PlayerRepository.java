package tsh.bd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    default List<Player> findAllByTeamsId(Integer idteam) {

        return findAllByTeamsId(idteam);
    }
    default Player findPlayersByPlayer_name(String player_name){
        return findPlayersByPlayer_name(player_name);
    }

    default List<Player>findAllByTeam(String team){
        return findAllByTeam(team);
    }

}
