package org.example.ex1_SeleniumBasics.BasicProject1;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_project02 {

    @Description ("TC#1 - Verify with the Invalid login, error msg ")
    @Owner("Ankita Bhujbal")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_Invalid_login(){
        WebDriver  driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        //Maximize window
        driver.manage().window().maximize();

        //Step 1- find the Email id and enter the admin@admin.com

        //<input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="1">

        WebElement email_InputBox= driver.findElement(By.id("login-username"));
        email_InputBox.sendKeys("admin@admin");


        //Step 1- find the password and enter the 123456
    // <input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // data-gtm-form-interact-field-id="0">

        WebElement password_InputBox= driver.findElement(By.name("password" ));
        password_InputBox.sendKeys("1234567");

        //Step 3 Find the submit button and click it
        //<button type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica">
        //	<span class="icon loader hidden"
        //	data-qa="zuyezasugu"></span>
        //<span data-qa="ezazsuguuy">Sign in</span>
        //</button>

        WebElement submit_button= driver.findElement(By.id("js-login-btn"));
        submit_button.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Step 4 - Verify the error msg
        //<div class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        WebElement ErrorMsg= driver.findElement(By.className("notification-box-description"));
        System.out.println(ErrorMsg.getText());

        //Step 5- TestNg assertions to very msh
        Assert.assertEquals(ErrorMsg.getText(),"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
