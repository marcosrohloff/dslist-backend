package br.com.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dslist.dto.GameMinDTO;
import br.com.dslist.entities.Game;
import br.com.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> lista = gameRepository.findAll();
		return lista.stream().map(GameMinDTO::new).toList();
	}

}
