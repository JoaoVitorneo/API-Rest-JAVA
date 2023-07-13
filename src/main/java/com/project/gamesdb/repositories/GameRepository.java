package com.project.gamesdb.repositories;

import com.project.gamesdb.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
