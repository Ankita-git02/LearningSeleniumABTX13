package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_Quit {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        //write code
        //wait
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://bing.com");
        driver.navigate().refresh();

        driver.close();//close the current window
        driver.quit();//close all the window



    }
}
