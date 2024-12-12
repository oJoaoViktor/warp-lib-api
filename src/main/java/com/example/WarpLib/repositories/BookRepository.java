package com.example.WarpLib.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WarpLib.models.products.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
