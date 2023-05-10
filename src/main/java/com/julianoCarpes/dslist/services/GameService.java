package com.julianoCarpes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.julianoCarpes.dslist.dto.GameMaxDTO;
import com.julianoCarpes.dslist.dto.GameMinDTO;
import com.julianoCarpes.dslist.entities.Game;
import com.julianoCarpes.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result=  gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameMaxDTO findById(Long id){
		Game result=  gameRepository.findById(id).get();
		return new GameMaxDTO(result);
		
	}

}
