package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_change_driver {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver = new FirefoxDriver();


    }
}
