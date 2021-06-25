package com.cybertek.tests.day5_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homework1 {
    public static void main(String[] args) throws InterruptedException {

     /*   Go to Ebay
            search Selenium
            click on search button
            verify title contains Selenium
     */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        driver.findElement(By.id("gh-ac")).sendKeys("Selenium");
        driver.findElement(By.id("gh-btn")).click();

        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());

        String expectedTitle = "selenium";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        Thread.sleep(5000);
        driver.quit();

    }
}
