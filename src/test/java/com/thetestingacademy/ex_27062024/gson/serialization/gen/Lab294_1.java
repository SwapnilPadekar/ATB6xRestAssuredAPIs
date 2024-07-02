package com.thetestingacademy.ex_27062024.gson.serialization.gen;

import com.google.gson.Gson;
import com.thetestingacademy.ex_27062024.gson.serialization.Booking;
import com.thetestingacademy.ex_27062024.gson.serialization.BookingDates;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab294_1 {
    // Payload - String, Map
    // Most Used - Class and Objects.
    // Swagger API - Document , File IO Binary File Payload
    // Non BDD - API Automation -
    // Cucumber BDD  - suite - Framework -. Cucumber BDD (Feature Files, Glue Other)
    // Payload -> RA -> Class or Objects -> JSONString ( Who Help, Library) - Serialization
    // Response -> jsonString -> Class or OBject ( Deserialization)

    //{
    //    "firstname" : "Jim",
    //    "lastname" : "Brown",
    //    "totalprice" : 111,
    //    "depositpaid" : true,
    //    "bookingdates" : {
    //         "checkin" : "2018-01-01",
    //         "checkout" : "2019-01-01"
    //       },
    //    "additionalneeds" : "Breakfast"
    //}


    RequestSpecification r = RestAssured.given();

    Response response;

    ValidatableResponse validatableResponse;


    @Description("TC#1 - Verify that create booking is working with valid payload")
    @Test
    public void testNonBDDStylePOSTPositive() {

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";


        Booking booking = new Booking();
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(-1);
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        // Serilization -> Java - POJO Booking -> Object - JSONString

        Gson gson = new Gson();
        String jsonStringPayload = gson.toJson(booking);
        System.out.println(jsonStringPayload);

    }


}
