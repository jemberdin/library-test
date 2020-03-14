package com.herokuapp.raamatukogu.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class CreatedBookPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(xpath = "/html/body/div/div/div[2]/p[1]/a")
    private WebElement author;

    @FindBy(xpath = "/html/body/div/div/div[2]/p[2]")
    private WebElement summary;

    @FindBy(xpath = "/html/body/div/div/div[2]/p[3]")
    private WebElement isbn;

    public CreatedBookPage(WebDriver driver) {
        super(driver);
        assertTrue(header.isDisplayed());
    }

    public String createdHeader() {
        return header.getText();
    }

    public String createdAuthor() {
        return author.getText();
    }

    public String createdSummary() {
        return summary.getText();
    }

    public String createdIsbn() {
        return isbn.getText();
    }
}
