package com.example.WarpLib.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WarpLib.models.products.Magazine;
import com.example.WarpLib.services.MagazineService;

@RestController
@RequestMapping("/api/magazine")
public class MagazineController extends GenericProductController<Magazine>{
    public MagazineController(MagazineService magazineService){
        super(magazineService);
    }
}