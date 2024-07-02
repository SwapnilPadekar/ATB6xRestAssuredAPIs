package com.thetestingacademy.ex_27062024;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab290_1 {
//    Payload using Map
//    POST request - Payload using String

//    {
//     	 "firstname" : "Jim",
//     	 "lastname" : "Brown",
//     	 "totalprice" : 111,
//     	 "depositpaid" : true,
//     	 "bookingdates" : {
//     	 "checkin" : "2018-01-01",
//     	   "checkout" : "2019-01-01"
//     	 },
//     	 "additionalneeds" : "Breakfast"
//    }

    @Test
    public void testPOSTRequest() {
        // for Hashmap the order will not be keep
        // in the Treemap it will sort
        //we need to preserve the order hence we are using LinkedHashMap

//        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();
//
//        Faker faker = new Faker();
//        String firstName = faker.name().firstName();
//        String lastName = faker.name().lastName();
//
//        jsonBodyUsingMap.put("firstname", firstName);
//        jsonBodyUsingMap.put("lastname", lastName);
//        jsonBodyUsingMap.put("totalprice", faker.random().nextInt(1000));
//        jsonBodyUsingMap.put("depositpaid", faker.random().nextBoolean());
//
//        //Hashmap within Hashmap
//        Map<String, Object> bookingDatesMap = new LinkedHashMap<>();
//        bookingDatesMap.put("checkin", "2024-01-01");
//        bookingDatesMap.put("checkout", "2024-01-31");
//        jsonBodyUsingMap.put("bookingdates", bookingDatesMap);
//
//        jsonBodyUsingMap.put("additionalneeds", "Breakfast, Snacks");
//
//        System.out.println(jsonBodyUsingMap);

        //==================================================================================
        //Code for POST request

        RequestSpecification r = RestAssured.given();
        Response response;
        ValidatableResponse validatableResponse; //Interface

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        String PAYLOAD = "{\n" +
                "    \"firstname\" : \""+firstName+"\",\n" +
                "    \"lastname\" : \""+lastName+"\",\n" +
                "    \"totalprice\" : 222,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "    \"checkin\" : \"2024-01-01\",\n" +
                "    \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        //given()
        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(PAYLOAD);

        //when()
        response = r.when().log().all().post();
        String respString = response.asString();
        System.out.println(respString);

        //then()
        validatableResponse = response.then();
        validatableResponse.statusCode(200);

    }


}
