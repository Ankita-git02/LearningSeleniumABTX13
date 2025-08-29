package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium13_NoHTTP {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
       // driver.get("bing.com"); - without https not work
        driver.get("https://bing.com");
        driver.quit();
    }
}
