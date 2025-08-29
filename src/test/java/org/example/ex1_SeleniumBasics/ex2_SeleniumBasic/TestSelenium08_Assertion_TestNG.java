package org.example.ex1_SeleniumBasics.ex2_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium08_Assertion_TestNG {

    //@Description("Verify that the title is visible.")
    @Test
    public void test_Selenium_assertion(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //TestNG Assersion

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        //assrtJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
    }
}
