package com.example.mapBackend.service;

import com.example.mapBackend.models.Card;

public interface CardService {

    public Iterable<Card> listCard();
    public Card createCard(Card card);
}
