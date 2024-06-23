package com.thetestingacademy.testng;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab261 {
    //Suppose we have 1000 test cases & we need to group them
    // as a Smoke/Sanity/Regression Suite
    // Or segregate like which should run before/after test cases etc.

    @Description("TC#261_1 - Verify get request 1  (PASS scenario)")
    @Test
    public void getRequest1() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }

    @Description("TC#261_2 - Verify get request 2 (FAIL scenario)")
    @Test
    public void getRequest2() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(200);
    }
}
