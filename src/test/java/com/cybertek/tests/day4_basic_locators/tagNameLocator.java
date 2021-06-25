package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement FullNameInput = driver.findElement(By.tagName("input"));
        FullNameInput.sendKeys("Ibro Erdonov with tagName");
        
        WebElement emailInput = driver.findElement(By.tagName("input"));
        emailInput.sendKeys("123@gmail.com");
        // tagname with 'input' will work only with the first occurrence so the email we provided will appear in "Full name field

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);
        driver.quit();



    }
}
