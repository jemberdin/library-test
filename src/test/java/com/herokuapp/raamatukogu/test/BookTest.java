package com.herokuapp.raamatukogu.test;

import com.herokuapp.raamatukogu.page_object.BooksCatalogPage;
import com.herokuapp.raamatukogu.page_object.CreateBookPage;
import com.herokuapp.raamatukogu.page_object.CreatedBookPage;
import org.testng.annotations.Test;

import static com.herokuapp.raamatukogu.test_data.BookTestData.*;
import static org.testng.Assert.assertEquals;


public class BookTest extends FunctionalTest {

    @Test
    public void createBook() {
        driver.get(CREATE_BOOK_PAGE);
        CreateBookPage createBookPage = new CreateBookPage(driver);
        createBookPage.enterTitle(BOOK.getTitle());
        createBookPage.selectAuthor(BOOK.getAuthor());
        createBookPage.enterSummary(BOOK.getSummary());
        createBookPage.enterIsbn(BOOK.getIsbn());

        CreatedBookPage createdBookPage = createBookPage.submit();
        assertEquals("Title: " + BOOK.getTitle(), createdBookPage.createdHeader());
        assertEquals(BOOK.getAuthor(), createdBookPage.createdAuthor());
        assertEquals("Summary: " + BOOK.getSummary(), createdBookPage.createdSummary());
        assertEquals("ISBN: " + BOOK.getIsbn(), createdBookPage.createdIsbn());
    }

    @Test(dependsOnMethods = {"createBook"})
    public void validateBook() {
        driver.get(BOOKS_CATALOG_PAGE);
        BooksCatalogPage booksCatalogPage = new BooksCatalogPage(driver);
        assertEquals(BOOK.getTitle(), booksCatalogPage.lastAddedBook().getText());
    }
}
