package com.github.beercafeguy.design.model;

public class Book {
    private String isbn;
    private String bookName;

    public Book(String isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!getIsbn().equals(book.getIsbn())) return false;
        return getBookName().equals(book.getBookName());
    }

    @Override
    public int hashCode() {
        int result = getIsbn().hashCode();
        result = 31 * result + getBookName().hashCode();
        return result;
    }
}
