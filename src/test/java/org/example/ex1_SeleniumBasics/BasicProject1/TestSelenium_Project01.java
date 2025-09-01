package org.example.ex1_SeleniumBasics.BasicProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Project01 {

    @Test
    public void test_Verify_text_katalon(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("TestCase passed");
            Assert.assertTrue(true);
        }else {
            System.out.println("test cases failed");
            Assert.fail();
        }
        driver.quit();
    }
}
