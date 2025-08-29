package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium15_OptionsClasses {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        //  chromeOptions.addArguments("--headless");//used running behind dont want to see running
        //chromeOptions.addArguments("--window-size=800,600");
        // chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
