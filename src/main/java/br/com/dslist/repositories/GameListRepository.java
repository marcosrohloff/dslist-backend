package br.com.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
