package com.vote.controllers;

import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Sql(value = {"/prepare-db.sql"})
public class VoterControllerTest {
    @Before
    public void setUp() throws Exception {
        RestAssured.port = 8001;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    //GET /api/voters
    public  void shouldGetAllVoters() throws Exception{
        given().log().all().and().given()
        .get("/api/voters")
                .then().log().all()
                .statusCode(200)
                .body(
                        "numberOfElements", is(3),
                        "totalPages", is(4),
                        "content[0].name", equalTo("Sally"),
                        "content[0].id", is(1),
                        "content[0].version", is(0)
                );

    }

}