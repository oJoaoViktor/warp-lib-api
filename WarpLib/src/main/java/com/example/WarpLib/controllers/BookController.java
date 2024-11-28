package com.example.WarpLib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.WarpLib.models.Book;
import com.example.WarpLib.repositories.BookRepository;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/books")
    public Iterable<Book> listBooks(){
        return bookRepository.findAll();
    }
}
