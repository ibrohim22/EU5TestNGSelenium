package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {

//         Verify confirmation message
//        -open chrome browser
//        -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
//        -enter any email
//        -verify that email is displayed in the input box
//        -click retrieve password
//        -verify that confirmation message says "Your email has been sent!"

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedEmail = "jamal@gmail.com";
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys(expectedEmail);

//      2 ways to get text from web elements
//      1- getText() -- > works 99% of time
//      2- getAttribute("value") -- > getting text from input boxes

        String actualEmail = emailInput.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

//      verify that email is displayed  in the input box

        if(expectedEmail.equals(actualEmail)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }


        WebElement retrievePassButton = driver.findElement(By.id("form_submit"));
        retrievePassButton.click();

//      -verify that confirmation message says "Your email has been sent!"

        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));
        System.out.println(actualConfirmationMessage.getText());
//      save actual message
        String actualMessage = actualConfirmationMessage.getText();

//      save expected message
        String expectedMessage = "Your e-mail's been sent!";

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        driver.quit();

    }
}
