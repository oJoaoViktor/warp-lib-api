package com.example.WarpLib.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WarpLib.models.products.Game;
import com.example.WarpLib.services.GameService;

@RestController
@RequestMapping("v1/api/games")
public class GameController extends GenericProductController<Game>{
    public GameController(GameService gameService){
        super(gameService);
    }
}