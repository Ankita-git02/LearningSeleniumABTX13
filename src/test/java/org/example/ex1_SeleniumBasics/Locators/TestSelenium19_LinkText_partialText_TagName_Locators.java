package org.example.ex1_SeleniumBasics.Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_LinkText_partialText_TagName_Locators {


    @Description ("Verify VWO")
    @Test
    public void test_login_vwo(){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link Td(n)"
        // data-qa="bericafeqo">
        // Start a free trial
        // </a>

        WebElement Text_full_match= driver.findElement(By.linkText("Start a free trial"));
        Text_full_match.click();

//        WebElement allowcookie= driver.findElement(By.id("onetrust-accept-btn-handler"));
//        allowcookie.click();

        WebElement start_freeTiral_email=driver.findElement(By.id("page-v1-step1-email"));
        start_freeTiral_email.sendKeys("abc1");

        WebElement click_checkbox= driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        click_checkbox.click();

//        WebElement submit_button= driver.findElement(By.cssSelector("[data-qa='page-su-submit']"));
//        submit_button.click();

        WebElement button= driver.findElement(By.tagName("button"));
        button.click();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        WebElement ErrorMsg= driver.findElement(By.className("invalid-reason"));
        //System.out.println(ErrorMsg.getText());
        Assert.assertEquals(ErrorMsg.getText(),"The email address you entered is incorrect.");



        driver.quit();
    }
}
