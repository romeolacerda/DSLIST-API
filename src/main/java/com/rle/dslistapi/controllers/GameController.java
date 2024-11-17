package com.rle.dslistapi.controllers;

import com.rle.dslistapi.dto.GameDto;
import com.rle.dslistapi.dto.GameMinDto;
import com.rle.dslistapi.entities.Game;
import com.rle.dslistapi.services.GameService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")

public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        GameDto result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = gameService.findALl();
        return result;
    }
}
