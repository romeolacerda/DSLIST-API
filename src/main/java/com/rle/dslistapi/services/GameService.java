package com.rle.dslistapi.services;

import com.rle.dslistapi.dto.GameDto;
import com.rle.dslistapi.dto.GameMinDto;
import com.rle.dslistapi.entities.Game;
import com.rle.dslistapi.projections.GameMinProjection;
import com.rle.dslistapi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findALl(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }
}