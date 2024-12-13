package com.example.WarpLib.services.products;

import org.springframework.stereotype.Service;

import com.example.WarpLib.models.products.Magazine;
import com.example.WarpLib.repositories.products.MagazineRepository;

@Service
public class MagazineService extends GenericProductService<Magazine>{
    public MagazineService(MagazineRepository magazineRepository){
        super(magazineRepository);
    }
}
