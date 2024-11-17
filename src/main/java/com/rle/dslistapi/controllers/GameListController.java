package com.rle.dslistapi.controllers;

import com.rle.dslistapi.dto.GameDto;
import com.rle.dslistapi.dto.GameListDto;
import com.rle.dslistapi.dto.GameMinDto;
import com.rle.dslistapi.services.GameListService;
import com.rle.dslistapi.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")

public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findALl();
        return result;
    }
}
