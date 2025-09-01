package org.example.ex1_SeleniumBasics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;

public class CommonToAll {
    public WebDriver driver;

    public void openBrowser(WebDriver driver, String Url){
        driver.get(Url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}
