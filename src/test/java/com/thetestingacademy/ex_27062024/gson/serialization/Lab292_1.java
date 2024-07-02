package com.thetestingacademy.ex_27062024.gson.serialization;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab292_1 {
    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse validatableResponse; //Interface

    @Description("TC#1 - Verify that create booking is working with valid payload")
    @Test
    public void testNonBDDStylePOSTPositive() {

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        Booking booking = new Booking(); // Booking class
        booking.setFirstname("Sweety");
        booking.setLastname("Sharma");
        booking.setTotalprice(999);
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates(); // BookingDates class
        bookingdates.setCheckin("2024-01-01");
        bookingdates.setCheckout("2024-01-15");

        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast, Lunch, Snacks");

        System.out.println(booking.toString());

        //given()
        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(booking);

        //when()
        response = r.when().log().all().post();
        String responseString = response.asString();
        System.out.println(responseString);

        //then()
        validatableResponse = response.then();
        validatableResponse.statusCode(200);

    }

}
