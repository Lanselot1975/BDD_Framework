Feature: API tests

  Scenario: Get single resource (Status code: 200)
    Given I set user service api endpoint "https://jsonplaceholder.typicode.com/posts?id=7"
    When I Set request HEADER
    And Send a GET HTTP request
    Then I receive valid Response "200"

   Scenario: Create user (Status code: 201)
     Given I set user service api endpoint POST "https://jsonplaceholder.typicode.com/posts"
     When I Set request POST HEADER
     Then Send a POST HTTP request


  Scenario: Google bad request user (Status code: 404)
    Given I set user service api endpoint POST "https://jsonplaceholder.typicode.com/postse"
    When I Set request POST HEADER
    Then Send a POST 404 HTTP request

