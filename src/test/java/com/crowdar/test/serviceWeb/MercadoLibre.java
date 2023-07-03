package com.crowdar.test.serviceWeb;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MercadoLibre {

    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://www.mercadolibre.com.ar/";
    }


    @Test
    public void getDepartments() {

        given()
                .when()
                .get("/menu/departments")
                .then()
                .statusCode(200);

    }
}
