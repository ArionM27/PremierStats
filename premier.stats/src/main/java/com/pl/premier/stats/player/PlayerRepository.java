package com.pl.premier.stats.player;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<player, String>{
    void deleteByName(String playerName);
    Optional<player> findByName(String name);
}


