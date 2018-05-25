package com.example.digitalforest.listviewdemo;

public class Book {
    private String bookName;
    private String author;
    private double price;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book() {
        super();
    }

    public Book(String bookName, String author, double price) {
        super();
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
}
