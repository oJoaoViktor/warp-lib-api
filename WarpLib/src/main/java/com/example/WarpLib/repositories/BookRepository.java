package com.example.WarpLib.repositories;
import com.example.WarpLib.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
