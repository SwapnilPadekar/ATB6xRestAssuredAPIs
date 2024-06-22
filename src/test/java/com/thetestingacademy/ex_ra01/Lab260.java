package com.thetestingacademy.ex_ra01;

import io.restassured.RestAssured;

public class Lab260 {
    public static void main(String[] args) {
//        Rest Assured Hello World program
//        Rest Assured - Java Domain Specific Language (DSL)
//
//        RestAssured.basic().authenticate().;
//
//        given -> url, header, auth, payload
//                when -> get, post
//                then -> a response which AI can verify
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);

    }
}
