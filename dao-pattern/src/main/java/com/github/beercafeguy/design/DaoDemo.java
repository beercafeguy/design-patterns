package com.github.beercafeguy.design;

import com.github.beercafeguy.design.dao.BookDao;
import com.github.beercafeguy.design.dao.BookDaoImpl;
import com.github.beercafeguy.design.model.Book;

import java.util.Collection;

public class DaoDemo {
    public static void main(String[] args) {
        Book b1=new Book("102HR4","Introduction to Programming");
        Book b2=new Book("uyeoqwuoej","Ancient History");
        Book b3=new Book("y6739273","Machine Learning : Cookbook");

        BookDao bookDao=new BookDaoImpl();
        bookDao.create(b1);
        bookDao.create(b2);
        bookDao.create(b3);

        System.out.println(bookDao.findAllBooks());
        bookDao.delete("102HR4");
        System.out.println(bookDao.findAllBooks());
    }
}
