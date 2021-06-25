package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {
    public static void main(String[] args) {

//         Verify URL changed
//        -open chrome browser
//        -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
//        -enter any email
//        -click on Retrieve password
//        -verify that url changed to http://practice.cybertekschool.com/email_sent

        WebDriver driver = WebDriverFactory.getDriver("chRome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("123123@mail.ru");

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedUrl= "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }

        driver.quit();

    }
}
