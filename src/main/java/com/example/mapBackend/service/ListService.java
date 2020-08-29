package com.example.mapBackend.service;

import com.example.mapBackend.models.List;

public interface ListService {
    public Iterable<List> listLists();
    public List createList(List list);
}
