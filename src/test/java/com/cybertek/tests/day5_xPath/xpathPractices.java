package com.cybertek.tests.day5_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathPractices {
    public static void main(String[] args) throws InterruptedException {

        /*
       DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        3. Locate all the WebElements on the page using XPATH locator only (total of 6)
   a. “Home” link
   b. “Forgot password” header
   c. “E-mail” text
   d. E-mail input box
   e. “Retrieve password” button
    4.Print text of a,b,c,e and put some email to d
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println(homeLink.getText());
        WebElement forgotPassword = driver.findElement(By.xpath("//h2"));
        System.out.println(forgotPassword.getText());
        WebElement eMailText = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println(eMailText.getText());
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9682228@gmail.com");
        WebElement retrievePasswordButton=driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        System.out.println(retrievePasswordButton.getText());
        Thread.sleep(5000);
        driver.quit();



    }
}
