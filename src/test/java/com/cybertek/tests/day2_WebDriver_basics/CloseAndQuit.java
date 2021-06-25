package com.cybertek.tests.day2_WebDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();   // ----> opens a browser
//        driver.get("http://practice.cybertekschool.com");
//
//        Thread.sleep(2000);
//        //close current tab
//        driver.close();

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(2000);

//        driver.close();  // --> will close only one current tab

        driver.quit();  // --> closes everything







    }
}
