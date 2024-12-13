package com.example.WarpLib.controllers.products;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WarpLib.models.products.PhysicalMedia;
import com.example.WarpLib.services.products.PhysicalMediaService;

@RestController
@RequestMapping("v1/api/physical-media")
public class PhysicalMediaController extends GenericProductController<PhysicalMedia>{
    public PhysicalMediaController(PhysicalMediaService physicalMediaService){
        super(physicalMediaService);
    }
}