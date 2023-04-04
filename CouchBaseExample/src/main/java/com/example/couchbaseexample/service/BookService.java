package com.example.couchbaseexample.service;

import com.couchbase.client.java.kv.GetResult;
import com.example.couchbaseexample.model.Book;
import com.example.couchbaseexample.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private static BookRepository repository = new BookRepository();

    public void createBook(Book book){
        repository.getBucket().defaultCollection().upsert(book.getId(), book);
    }

    public Book readBook(String id){
        GetResult result = repository.getBucket().defaultCollection().get(id);
        Book book = new Book();

        book.setId(result.contentAsObject().get("id").toString());
        book.setTitle(result.contentAsObject().get("title").toString());
        book.setAuthor(result.contentAsObject().get("author").toString());
        book.setYear((int)result.contentAsObject().get("year"));

        return book;
    }

    public void updateBook(Book book){
        repository.getBucket().defaultCollection().replace(book.getId(), book);
    }

    public void deleteBook(String id){
        repository.getBucket().defaultCollection().remove(id);
    }
}
