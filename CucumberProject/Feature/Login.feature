@Login
  Feature: Login Function
    Scenario: Test the login functionality

      Given user is on the website
      When user enters the login creds
      And user clicks submit
      Then user gets confirmation