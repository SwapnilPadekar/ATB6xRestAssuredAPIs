package com.thetestingacademy.testng;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Lab262 {

    @Description("TC#262_1 - Verify get request 1")
    @Test
    public void getRequest1(){
        System.out.println("Get Request 1");
    }

    @Description("TC#262_2 - Verify get request 2")
    @Test
    public void getRequest2(){
        System.out.println("Get Request 2");
    }

    @Description("TC#262_3 - Verify get request 3")
    @Test
    public void getRequest3(){
        System.out.println("Get Request 3");
    }
}
