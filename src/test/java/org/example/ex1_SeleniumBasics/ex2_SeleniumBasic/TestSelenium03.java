package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Test
    public  void Test_Selenium01(){
        //Start and stop itself
        //Selenium3 Set the path
        //Systme.getProperty("webdriver.gecko.driver","/path/geckodriver");


        FirefoxDriver driver= new FirefoxDriver();
        driver.get("https://google.com");
        //ypu need to setup the driver (brower)
    }
}
