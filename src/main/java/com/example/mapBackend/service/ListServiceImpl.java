package com.example.mapBackend.service;

import com.example.mapBackend.models.List;
import com.example.mapBackend.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListServiceImpl implements ListService{

    @Autowired
    private ListRepository listRepository;

    @Override
    public Iterable<List> listLists() {
        return listRepository.findAll();
    }

    @Override
    public List createList(List list) {
        return listRepository.save(list);
    }
}
