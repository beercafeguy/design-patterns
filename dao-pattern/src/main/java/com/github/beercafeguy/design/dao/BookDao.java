package com.github.beercafeguy.design.dao;

import com.github.beercafeguy.design.model.Book;

import java.util.Collection;
import java.util.List;

public interface BookDao {
    Collection<Book> findAllBooks();
    void create(Book book);
    void delete(String isbn);
    Book find(String isbn);
}
