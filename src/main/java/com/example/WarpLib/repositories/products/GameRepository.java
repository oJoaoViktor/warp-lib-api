package com.example.WarpLib.repositories.products;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WarpLib.models.products.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
}
