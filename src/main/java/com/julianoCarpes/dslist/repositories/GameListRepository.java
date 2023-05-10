package com.julianoCarpes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianoCarpes.dslist.entities.Game;
import com.julianoCarpes.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
