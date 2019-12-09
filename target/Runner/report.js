$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("apitests.feature");
formatter.feature({
  "line": 1,
  "name": "API tests",
  "description": "",
  "id": "api-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get single resource (Status code: 200)",
  "description": "",
  "id": "api-tests;get-single-resource-(status-code:-200)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I set user service api endpoint \"https://jsonplaceholder.typicode.com/posts?id\u003d7\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Set request HEADER",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Send a GET HTTP request",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I receive valid Response \"200\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jsonplaceholder.typicode.com/posts?id\u003d7",
      "offset": 33
    }
  ],
  "location": "StepdefsAPI.i_set_user_service_api_endpoint(String)"
});
formatter.result({
  "duration": 125344985,
  "status": "passed"
});
formatter.match({
  "location": "StepdefsAPI.i_Set_request_HEADER()"
});
formatter.result({
  "duration": 812162,
  "status": "passed"
});
formatter.match({
  "location": "StepdefsAPI.send_a_GET_HTTP_request()"
});
formatter.result({
  "duration": 567295780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 26
    }
  ],
  "location": "StepdefsAPI.i_receive_valid_Response(String)"
});
formatter.result({
  "duration": 241114983,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Create user (Status code: 201)",
  "description": "",
  "id": "api-tests;create-user-(status-code:-201)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I set user service api endpoint POST \"https://jsonplaceholder.typicode.com/posts\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Set request POST HEADER",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Send a POST HTTP request",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jsonplaceholder.typicode.com/posts",
      "offset": 38
    }
  ],
  "location": "StepdefsAPI.i_set_user_service_api_endpoint_POST(String)"
});
formatter.result({
  "duration": 250685,
  "status": "passed"
});
formatter.match({
  "location": "StepdefsAPI.i_Set_request_POST_HEADER()"
});
formatter.result({
  "duration": 22777,
  "status": "passed"
});
formatter.match({
  "location": "StepdefsAPI.send_a_POST_HTTP_request()"
});
formatter.result({
  "duration": 341867457,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Google bad request user (Status code: 404)",
  "description": "",
  "id": "api-tests;google-bad-request-user-(status-code:-404)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I set user service api endpoint POST \"https://jsonplaceholder.typicode.com/postse\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I Set request POST HEADER",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Send a POST 404 HTTP request",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jsonplaceholder.typicode.com/postse",
      "offset": 38
    }
  ],
  "location": "StepdefsAPI.i_set_user_service_api_endpoint_POST(String)"
});
formatter.result({
  "duration": 106569,
  "status": "passed"
});
formatter.match({
  "location": "StepdefsAPI.i_Set_request_POST_HEADER()"
});
formatter.result({
  "duration": 16662,
  "status": "passed"
});
formatter.match({
  "location": "StepdefsAPI.send_a_POST_404_HTTP_request()"
});
formatter.result({
  "duration": 302263469,
  "status": "passed"
});
});