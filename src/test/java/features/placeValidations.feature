Feature: Validating place API's


Scenario: verify if place is successfully added using add place API
Given Add place payload
When user calls "AddPlaceAPI" with "post" http request
Then the API call got success with status code 200 
And "status" in response body is "OK"
And "scope"	in response body is "APP"