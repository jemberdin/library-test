package com.herokuapp.raamatukogu.test_data;

public class Book {

    private String title;
    private String author;
    private String summary;
    private String isbn;

    public Book(String title, String author, String summary, String isbn) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() { return author; }

    public String getSummary() {
        return summary;
    }

    public String getIsbn() {
        return isbn;
    }
}
