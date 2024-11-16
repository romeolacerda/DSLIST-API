package com.rle.dslistapi.repositories;

import com.rle.dslistapi.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
