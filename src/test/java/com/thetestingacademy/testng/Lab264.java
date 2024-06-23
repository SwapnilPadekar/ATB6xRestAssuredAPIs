package com.thetestingacademy.testng;

import org.testng.annotations.*;


public class Lab264 {
    @BeforeSuite
    void Demo1(){
        System.out.println("BeforeSuite");
        System.out.println("Open DB");
        System.out.println("Read CSV or Excel File");
        System.out.println("Read text or Environment oe Property file");
    }

    @BeforeTest
    void Demo2(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    void Demo3(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void Demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void Demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void Demo6(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void Demo7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    void Demo8(){
        System.out.println("AfterTest");
    }

    @AfterSuite
    void Demo9(){
        System.out.println("AfterSuite");
        System.out.println("Close DB Connections");
        System.out.println("Close all open connections");
    }

}
