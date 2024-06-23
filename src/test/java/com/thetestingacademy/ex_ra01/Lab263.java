package com.thetestingacademy.ex_ra01;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab263 {
    @Description("TC#263_1 - Verify get request 1  (FAIL scenario)")
    @Test
    public void getRequest1() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(202);
    }
}
