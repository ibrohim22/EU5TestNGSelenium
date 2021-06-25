package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");


//      make browser full screen
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Ibrohim Erdonov");

//        WebElement emailInputBox = driver.findElement(By.name("email"));
//        emailInputBox.sendKeys("123123@gmail.com");

        // lazy way of the above code
        driver.findElement(By.name("email")).sendKeys("123123@gmail.com");

        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        driver.quit();


    }
}
