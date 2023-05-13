package com.julianoCarpes.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.julianoCarpes.dslist.dto.GameListDTO;
import com.julianoCarpes.dslist.entities.GameList;
import com.julianoCarpes.dslist.projections.GameMinProjection;
import com.julianoCarpes.dslist.repositories.GameListRepository;
import com.julianoCarpes.dslist.repositories.GameRepository;


@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
	@Transactional
	public void move(Long listId,int sourceIndex,int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex,obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; min < max; i++) {
			gameListRepository.updateBelongingPosition(listId,list.get(i).getId() , i);
		}
	}
}

