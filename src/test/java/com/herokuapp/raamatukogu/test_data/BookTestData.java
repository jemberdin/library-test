package com.herokuapp.raamatukogu.test_data;

import com.herokuapp.raamatukogu.test_data.Book;

public class BookTestData {

    public static final Book BOOK = new Book("Test book3", "Carroll, Lewis", "Book summary", "ISBN13");
    public static final String CREATE_BOOK_PAGE = "https://raamatukogu.herokuapp.com/catalog/book/create";
    public static final String BOOKS_CATALOG_PAGE = "https://raamatukogu.herokuapp.com/catalog/books";

}
