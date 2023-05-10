package com.julianoCarpes.dslist.dto;

import com.julianoCarpes.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	
	public GameListDTO() {
		
	}
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name =entity.getName();
	}
	public String getName() {
		return name;
	}
	public Long getId() {
		return id;
	}
	
	
}
