package com.example.WarpLib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WarpLib.models.products.Magazine;

public interface MagazineRepository extends JpaRepository<Magazine, Long>{
}