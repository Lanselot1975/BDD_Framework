Feature: Acceptance testing to validate functionality of Phptravels website

  Opens our website (https://www.phptravels.net/) in a few different web Browser
  Run scenario's to verified website UI functionality
  Login will run in background before every scenario
  TEST scenario:
    1. Verify login data.
    2. Book hotel
    3. Book VISA



  Background:
    Given I am open "https://www.phptravels.net/" website in a web Browser
    When I Navigate to 'My Account' and choose login
    And I insert username "user@phptravels.com"
    And I insert password "demouser"
    And I press login button



    Scenario Outline: Verify login data
      Given I verify I am on account page
      When I navigate to my profile
      Then I verify account data "<fname>""<lname>""<phone>""<email>""<address>"
      And I press Submit and logout
      Examples:
        | fname | lname | phone     | email               | address             |
        | Demo  | User  | 123456    | user@phptravels.com | R2, Avenue du Maroc |



     Scenario Outline: Login to the Phptravels and book a hotel
       Given I am open "https://www.phptravels.net/" website in a web Browser
       Given Navigate to book hotel page
       When I select booking "<destination>"
       And I select "<check_in>" date
       And I select checkout "<check_out>" date
  #     And I select adults "<adults>" amount
  #     And I select "<child>" amount - Child selection not implemented -- BUG --
       And I press search button
       Then I verify I navigate to the right page "<destination>"
       And I select hotel
       And I verify I am selected right hotel "The Fairmont Royal York"
       And I book the room
       And I verify I am booking right hotel "The Fairmont Royal York"
  #    I fill personal information to finish booking
       Then I select my title "<title>"
       And I enter my name "<fname>"
       And I enter my last name "<lname>"
       And I enter my email "<email>"
       And I select my country "<country>"
       And I enter my phone "<phone>"
       And I enter my card name "<card_holder>"
       And I enter my card number "<card_number>"
       And I enter my expire month "<exp_month>"
       And I enter my expire year "<exp_year>"
       And I enter my secret number "<sec_num>"
       And I press complete booking button
       Examples:
       |destination| check_in  | check_out  | fname | lname      | title | email         | country | phone  | card_holder     | card_number |  exp_month | exp_year | sec_num | destination |
       |Toronto    | 29/11/2019| 31/11/2019 | Alex  | Alexandrov | Ms.   | qazxsw@wed.com| Canada  | 123456 | Alex Alexandrov | 123456      |   06       | 2023     | 123     | Toronto |


  Scenario Outline: Login to the Phptravels and book a VISA
    Given I am open "https://www.phptravels.net/" website in a web Browser
    Given Navigate to book visa page
    When I select from country "<from_country>"
    And I select to country "<to_country>"
    And I select date "<date>"
    And I press submit button
    Then I verify visa destination
    And I enter my First name "<fname>"
    And I enter my Last name "<lname>"
    And I enter my email address "<email>"
    And I confirm my email address "<email>"
    And I enter my mobilephone "<mobile>"
    And I verify date "<date>"
    And I check button to complite the booking
    And I verify visa booked and reservation code exist
    Examples:
      |from_country| to_country  | date       | fname | lname      | email         | mobile  |
      |Canada      | Turkey      | 31-11-2019 |  Alex | Alexandrov | qazxsw@wed.com| 123456 |