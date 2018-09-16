package com.github.beercafeguy.design.dao;

import com.github.beercafeguy.design.model.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDaoImpl implements BookDao{
    private Map<String,Book> books=new HashMap<String, Book>();
    public Collection<Book> findAllBooks() {
        return books.values();
    }

    public void create(Book book) {
        books.put(book.getIsbn(),book);
    }

    public void delete(String isbn) {
        books.remove(isbn);
    }

    public Book find(String isbn) {
        return books.get(isbn);
    }
}
