package com.cybertek.tests.day5_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homework2_wikipedia {
    public static void main(String[] args) throws InterruptedException {

        /* Go to wikipedia.org (Links to an external site.)
        enter search term `selenium webdriver`
        click on search button
        click on search result `Selenium (software)`
        verify url ends with `Selenium_(software)'

        */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://wikipedia.org");

        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button/i[starts-with(@class,'sprite svg-search-icon')]")).click();

        driver.findElement(By.xpath("//a[@href='/wiki/Selenium_(software)']")).click();

        String actualUrl = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        String expectedUrl = "Selenium_(software)";

        if(actualUrl.endsWith(expectedUrl)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        Thread.sleep(5000);
        driver.quit();
        
        



    }
}
