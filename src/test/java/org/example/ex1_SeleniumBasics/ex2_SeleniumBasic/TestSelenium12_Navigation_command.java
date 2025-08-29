package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestSelenium12_Navigation_command {
    @Description ("Open the URL")
    @Test
    public  void test_Selenium01(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        //User  navigation command
        //navigate to  a url
        //navigate.to()
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();
    }
}
