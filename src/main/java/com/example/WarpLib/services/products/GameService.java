package com.example.WarpLib.services.products;

import org.springframework.stereotype.Service;

import com.example.WarpLib.models.products.Game;
import com.example.WarpLib.repositories.products.GameRepository;

@Service
public class GameService extends GenericProductService<Game> {
    public GameService(GameRepository gameRepository){
        super(gameRepository);
    }
}