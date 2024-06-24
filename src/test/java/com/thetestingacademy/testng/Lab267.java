package com.thetestingacademy.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.security.rsa.RSAUtil;

public class Lab267 {

    //CRUD
    //Create Booking -> ID
    //Create Auth -> Token
    //PUT -> ID, Token
    //Delete -> ID
    //GET -> ID --Verify it should not exist

    String token;
    Integer bookingID;

    public String getToken(){
        token = "123";
        return token;
    }

    @BeforeTest
    public void getTokenAndBookingID(){
        token = getToken();
        //Post request
        //Post code
        bookimngID = 123;
    }

    @Test
    public void testPUTReq(){
        System.out.println(token);
        System.out.println(bookingID);
        //PUT code
    }

    @Test
    public void testDELETEReq(){
        System.out.println(token);
        System.out.println(bookingID);
        //DELETE code
    }

    @Test
    public void testGETReq(){
        System.out.println(bookingID);
        //GET code
    }


}
