package com.cybertek.tests.day2_WebDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {

        // Task open chrome and navigate to http://practice.cybertekschool,com

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        // getting title with selenium
        // shortcut for creating variable --> alt + enter enter
        
        String title = driver.getTitle();
        System.out.println("title = " + title);

        //getCurrentUrl --> get the url from the browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

    }
}
