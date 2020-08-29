package com.example.mapBackend.repositories;

import com.example.mapBackend.models.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<List, Long> {

    @Query("FROM List u WHERE u.list = ?1")
    public List login(String list);

}
