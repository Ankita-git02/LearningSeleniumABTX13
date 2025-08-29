package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium04 {
    public static void main(String[] args) {
//        SearchContext driver = new EdgeDriver();
//        SearchContext driver1 = new FirefoxDriver();
//        SearchContext driver2 = new InternetExplorerDriver();

//        WebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver1 = new ChromeDriver();
//        ChromeDriver driver2 = new ChromeDriver();

        //Scenario1
        //1. Do you want to run chrome or edge?(2 or 3 %use)
        ChromeDriver driver = new ChromeDriver();

        //2.do you want to run on chrome then chnage to edge(96)

        WebDriver  driver1 =  new ChromeDriver();
        driver1= new EdgeDriver();

        ///3. do you want to run on multiple
    }
}
