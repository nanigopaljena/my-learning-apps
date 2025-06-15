package com.sample.app.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    @Value("${host.url}")
    private String hostUrl;

    private final TestRestTemplate restTemplate = new TestRestTemplate();
    private ResponseEntity<String> response;

    @Given("the initial setup is done")
    public void setUpInitialData() {
//        the initial data like Oauth token and all can be set here
    }

    @When("I make the call to {string} API")
    public void makeApiCall(String uri) {
        response = restTemplate.getForEntity(hostUrl + uri, String.class);
    }

    @Then("I should receive {string}")
    public void assertTheValues(String expected) {
        assertThat(response.getBody()).isEqualTo(expected);
    }

}
