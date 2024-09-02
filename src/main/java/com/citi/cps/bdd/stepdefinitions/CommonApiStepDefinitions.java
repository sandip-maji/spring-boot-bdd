package com.citi.cps.bdd.stepdefinitions;

import com.citi.cps.TestTraceServiceApplication;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = TestTraceServiceApplication.class)
public class CommonApiStepDefinitions {


    @When("User sends a {string} request to {string} service with {string} for Common Api")
    public void user_sends_a_request_to_service_with_for_common_api(String string, String string2, String string3) {
        System.err.println("user_sends_a_request_to_service_with_for_common_api");
    }

    @Then("User validate response status code {string} body attribute {string} for Common Api")
    public void user_validate_response_status_code_body_attribute_for_common_api(String string, String string2) {
        System.err.println("user_validate_response_status_code_boy_attribute_for_common_api");
    }

}
