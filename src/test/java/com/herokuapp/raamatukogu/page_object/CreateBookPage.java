package com.herokuapp.raamatukogu.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.openqa.selenium.support.How.CSS;
import static org.testng.Assert.assertTrue;

public class CreateBookPage extends PageObject {

    @FindBy(id="title")
    private WebElement titleField;

    @FindBy(how = CSS, using = "option")
    private List<WebElement> authorOptions;

    @FindBy(id="summary")
    private WebElement summaryField;

    @FindBy(id="isbn")
    private WebElement isbnField;

    @FindBy(id="5b6714c73809970014e31c99")
    private WebElement genreNoneFictionCheckBox;

    @FindBy(id="5b6714c93809970014e31c9a")
    private WebElement genreFictionCheckBox;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/button")
    private WebElement submitButton;

    public CreateBookPage(WebDriver driver) {
        super(driver);
        assertTrue(titleField.isDisplayed());
    }

    public void enterTitle(String title) {
        titleField.sendKeys(title);
    }

    public void selectAuthor(String name) {
        getKey(getAuthors(), name).click();
    }

    public void enterSummary(String summary) {
        summaryField.sendKeys(summary);
    }

    public void enterIsbn(String isbn) {
        isbnField.sendKeys(isbn);
    }

    public void selectGenreNoneFictionCheckBox() {
        genreNoneFictionCheckBox.click();
    }

    public void selectGenreFictionCheckBox() {
        genreFictionCheckBox.click();
    }

    public CreatedBookPage submit() {
        submitButton.click();
        return new CreatedBookPage(driver);
    }

    public Map<WebElement, String> getAuthors() {
        Map<WebElement, String> authors = new HashMap<>();

        for (int i = 0; i < authorOptions.size(); i++) {
            authors.put(authorOptions.get(i), authorOptions.get(i).getText());
        }
        return authors;
    }

    public <K, V> K getKey(Map<K, V> map, V value) {
        return map.entrySet().stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
    }
}
