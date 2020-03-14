package com.herokuapp.raamatukogu.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertTrue;


public class BooksCatalogPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div/div[2]/li[last()]/a")
    private WebElement lastAddedBook;

    public BooksCatalogPage(WebDriver driver) {
        super(driver);
        assertTrue(lastAddedBook.isDisplayed());
    }

    public WebElement lastAddedBook() {
        return lastAddedBook;
    }
}
