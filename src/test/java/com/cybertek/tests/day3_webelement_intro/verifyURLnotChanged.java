package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) {


//        Verify URL not changed
//        -open chrome browser
//        -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
//        -click on Retrieve password
//        -verify that url did not change


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // saving current url to compare with the result
        String expectedUrl = driver.getCurrentUrl();

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        // saving actual url after clicking the button
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        // close your browser
        driver.quit();
    }
}
