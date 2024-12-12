package com.example.WarpLib.services;

import org.springframework.stereotype.Service;

import com.example.WarpLib.models.products.Magazine;
import com.example.WarpLib.repositories.MagazineRepository;

@Service
public class MagazineService extends GenericProductService<Magazine>{
    public MagazineService(MagazineRepository magazineRepository){
        super(magazineRepository);
    }
}
