package net.wonlee.sevenwonders.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wonlee.sevenwonders.domain.Card;
import net.wonlee.sevenwonders.repository.CardRepository;


@Service
public class CardServiceImpl implements CardService {
	
	private CardRepository cardRepository;
	
    @Autowired
    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;

    }

	@Override
	public List<Card> listAll() {
        List<Card> cards = new ArrayList<Card>();
        cardRepository.findAll().forEach(cards::add);
        
        if (cards.isEmpty()) {
        	System.out.println("Array List is empty");
        			
        } 
        for (Card c : cards) {
        	System.out.println(c.toString());
        }
        return cards;
	}

	@Override
	public Card getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card saveOrUpdate(Card product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}	

}
