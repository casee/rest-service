package com.vr.spring.web.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class RestServiceSteps extends SpringIntegrationTest {

    private String response;

    @When("Client calls greeting for (\\S+)$")
    public void clientCallsGreeting(String name) {
        this.response = executeGet("http://localhost:8080/greeting/api/greeting?name=" + name);
    }

    @Then("Server responds with")
    public void serverRespondsWith(String expected) {
        assertEquals(expected, response);
    }

}