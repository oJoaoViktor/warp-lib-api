package com.example.WarpLib.services;


import org.springframework.stereotype.Service;

import com.example.WarpLib.models.products.Book;
import com.example.WarpLib.repositories.BookRepository;

@Service
public class BookService extends GenericProductService<Book> {
    public BookService(BookRepository bookRepository){
        super(bookRepository);
    }
}
