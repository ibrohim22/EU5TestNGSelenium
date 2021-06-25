package com.cybertek.tests.day7_TestNg;

import org.testng.annotations.*;

import javax.xml.bind.SchemaOutputResolver;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFORE CLASS--");
        System.out.println("executed one time before the class");
    }
    @Test
    public void test1(){
        System.out.println("first test case");
    }
    @Test
    public void test2(){
        System.out.println("second test case");
    }
    @Test
    public void test3(){
        System.out.println("third test case");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("--BEFORE METHOD--");
        System.out.println("WebDriver, Opening browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("--AFTER METHOD--");
        System.out.println("closing browser, quit");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--AFTER CLASS");
        System.out.println("Some Reporting Code Here");
        System.out.println("adding some work to practice pushing to repository");
    }

}
