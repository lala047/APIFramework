package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinition extends Utils{
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
TestDataBuild data =new TestDataBuild();

@Given("Add place payload")
public void add_place_payload() {
    // Write code here that turns the phrase above into concrete actions
	
	 
			 //res=given().spec(requestSpecification())
			 //.body(data.addPlacePayload());
			//.body(data.addPlacePayLoad(name,language,address)); if it is scenario outline(dynamic data

}
@When("user calls {string} with post http request")
public void user_calls_with_post_http_request(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("the API call got success with status code {int}")
public void the_api_call_got_success_with_status_code(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("{string} in response body is {string}")
public void in_response_body_is(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("\"scope\"in response body is {string}")
public void scope_in_response_body_is(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}




}
