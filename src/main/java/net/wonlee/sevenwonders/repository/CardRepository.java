package net.wonlee.sevenwonders.repository;


import org.springframework.data.repository.CrudRepository;

import net.wonlee.sevenwonders.domain.Card;

public interface CardRepository extends CrudRepository<Card, Long> {
	
}
