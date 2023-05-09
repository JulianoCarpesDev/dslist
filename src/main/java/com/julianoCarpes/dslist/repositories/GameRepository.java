package com.julianoCarpes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianoCarpes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
