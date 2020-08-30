package com.example.mapBackend.service;

import com.example.mapBackend.models.Card;
import com.example.mapBackend.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Iterable<Card> listCard() {
        return cardRepository.findAll();
    }

    @Override
    public Card createCard(Card card) {
        return cardRepository.save(card);
    }
}
