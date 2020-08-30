package com.example.mapBackend.controller;

import com.example.mapBackend.models.Card;
import com.example.mapBackend.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping
    public Iterable<Card> findAll(){
        return cardService.listCard();
    }

    @PostMapping
    public Card createCard(@RequestBody Card card){
        return cardService.createCard(card);
    }
}
