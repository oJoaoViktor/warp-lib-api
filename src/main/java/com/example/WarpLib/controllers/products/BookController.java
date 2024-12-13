package com.example.WarpLib.controllers.products;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WarpLib.models.products.Book;
import com.example.WarpLib.services.products.BookService;

@RestController
@RequestMapping("v1/api/books")
public class BookController extends GenericProductController<Book>{
    public BookController(BookService bookService){
        super(bookService);
    }
}
