package com.rle.dslistapi.services;

import com.rle.dslistapi.dto.GameListDto;
import com.rle.dslistapi.entities.GameList;
import com.rle.dslistapi.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findALl(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }
}