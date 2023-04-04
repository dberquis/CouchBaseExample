package com.example.couchbaseexample.controller;

import com.example.couchbaseexample.model.Book;
import com.example.couchbaseexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping(value = "/create")
    public String postBook(@RequestBody Book book){
        service.createBook(book);
        return "Created book with id: " + book.getId();
    }

    @GetMapping(value = "/read/{id}")
    public Book getBook(@PathVariable String id){
        return service.readBook(id);
    }

    @PutMapping(value = "/update")
    public String putBook(@RequestBody Book book){
        service.updateBook(book);
        return "Updated book with id: " + book.getId();
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable String id){
        service.deleteBook(id);
        return "Deleted book with id: " + id;
    }
}
