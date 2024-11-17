package com.rle.dslistapi.repositories;

import com.rle.dslistapi.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
