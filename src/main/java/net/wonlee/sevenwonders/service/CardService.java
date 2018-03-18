package net.wonlee.sevenwonders.service;

import java.util.List;

import net.wonlee.sevenwonders.domain.Card;

public interface CardService {
    List<Card> listAll();

    Card getById(Long id);

    Card saveOrUpdate(Card product);

    void delete(Long id);

//    Card saveOrUpdateProductForm(CardForm cardForm);
}
