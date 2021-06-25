package com.cybertek.tests.day5_xPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {

        /* Task
         Go to amazon.com
         search for "selenium"
         click search button
         verify 1-48 of 150 results for "selenium"
        */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement searchInput= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchInput.sendKeys("selenium");
        driver.findElement(By.id("nav-search-submit-button")).click();

        WebElement searchResultText = driver.findElement(By.xpath("(//span[@dir='auto'])[1]"));
        System.out.println(searchResultText.getText());
        String actualMessage= searchResultText.getText();

        String expectedResult= "1-48 of 149 results for \"selenium\"";
        if(actualMessage.equals(expectedResult)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }





    }
}
