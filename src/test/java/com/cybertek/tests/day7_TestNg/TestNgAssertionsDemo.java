package com.cybertek.tests.day7_TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAssertionsDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("Opening browser");
    }

    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title", "tiTle");

        System.out.println("Second Assertion");
        Assert.assertEquals("url", "url");

    }
    @Test
    public void test2(){
        System.out.println("Second test execution");
        Assert.assertEquals("test2", "test2");


    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Close browser");
    }
}
