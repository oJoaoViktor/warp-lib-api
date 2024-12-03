package com.example.WarpLib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WarpLib.models.products.PhysicalMedia;

public interface PhysicalMediaRepository extends JpaRepository<PhysicalMedia, Long>{
    
}
