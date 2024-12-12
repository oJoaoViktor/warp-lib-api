package com.example.WarpLib.services;

import org.springframework.stereotype.Service;

import com.example.WarpLib.models.products.Game;
import com.example.WarpLib.repositories.GameRepository;

@Service
public class GameService extends GenericProductService<Game> {
    public GameService(GameRepository gameRepository){
        super(gameRepository);
    }
}