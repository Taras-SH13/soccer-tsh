package tsh.bd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    public List<Player> findByIdteam(Integer id);

}
