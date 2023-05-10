package com.julianoCarpes.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julianoCarpes.dslist.dto.GameListDTO;
import com.julianoCarpes.dslist.dto.GameMaxDTO;
import com.julianoCarpes.dslist.dto.GameMinDTO;
import com.julianoCarpes.dslist.entities.Game;
import com.julianoCarpes.dslist.services.GameListService;
import com.julianoCarpes.dslist.services.GameService;
@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;	

	@GetMapping(value = "/{id}")
	public GameMaxDTO findById(@PathVariable Long id) {
		GameMaxDTO result = gameService.findById(id);
		return result;
	}

	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}

