package com.example.mapBackend.models;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String card;

    public Card (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
