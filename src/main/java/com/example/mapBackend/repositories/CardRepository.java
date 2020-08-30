package com.example.mapBackend.repositories;

import com.example.mapBackend.models.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {

    @Query("FROM Card u WHERE u.card = ?1")
    public Card login(String card);
}
