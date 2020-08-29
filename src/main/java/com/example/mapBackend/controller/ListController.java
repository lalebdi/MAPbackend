package com.example.mapBackend.controller;

import com.example.mapBackend.models.List;
import com.example.mapBackend.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/list")
public class ListController {

    @Autowired
    private ListService listService;

    @GetMapping
    public Iterable<List> findAll() {
        return listService.listLists();
    }

    @PostMapping
    public List createList(@RequestBody List list){
        return listService.createList(list);
    }

}
