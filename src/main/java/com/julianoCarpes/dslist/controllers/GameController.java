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
@RequestMapping(value = "/lists")
public class GameController {
	@Autowired
	private GameListService gameListService;
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	
}
