package com.thetestingacademy.testng;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.lang.ref.SoftReference;

public class Lab265 {

    @Description("TC265_1")
    @Test
    public void testCase(){
//        Assertion => Expected Result <==> Actual Result
//        200 OK = 200 OK
//            2 types of assertions
//                1. Soft Assertions

        SoftAssert s = new SoftAssert();
        s.assertEquals("swapnil", "Swapnil", "Not equal");
        s.assertEquals("snehal", "Swapnil", "Not equal");
        System.out.println("End of the program"); // Anyways this will be executed
        s.assertAll();

//                2. Hard Assertions ()
        Assert.assertEquals("swapnil", "Swapnil");
        System.out.println("End of the program"); // This woll not be executed if above condition failed
    }
}
