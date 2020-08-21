package tsh.bd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    default List<Player> findAllByTeamsId(Integer team) {

        return findAllByTeamsId(team);
    }
    default Player findPlayersByPlayer_name(String name){
        return findPlayersByPlayer_name(name);
    }

}
