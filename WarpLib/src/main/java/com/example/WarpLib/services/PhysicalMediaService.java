package com.example.WarpLib.services;

import org.springframework.stereotype.Service;

import com.example.WarpLib.models.products.PhysicalMedia;
import com.example.WarpLib.repositories.PhysicalMediaRepository;

@Service
public class PhysicalMediaService extends GenericProductService<PhysicalMedia> {
    public PhysicalMediaService(PhysicalMediaRepository physicalMediaRepository){
        super(physicalMediaRepository);
    }
}
