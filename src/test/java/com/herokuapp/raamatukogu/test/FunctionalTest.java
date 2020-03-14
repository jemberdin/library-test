package com.herokuapp.raamatukogu.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_mac64");
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_linux64");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
