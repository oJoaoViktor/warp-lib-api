package com.example.WarpLib.controllers.products;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WarpLib.models.products.Magazine;
import com.example.WarpLib.services.products.MagazineService;

@RestController
@RequestMapping("v1/api/magazine")
public class MagazineController extends GenericProductController<Magazine>{
    public MagazineController(MagazineService magazineService){
        super(magazineService);
    }
}