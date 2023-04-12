package com.example.testcontract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    public void setUp() throws Exception {
        RestAssuredMockMvc.standaloneSetup(new Controller());
    }

}
