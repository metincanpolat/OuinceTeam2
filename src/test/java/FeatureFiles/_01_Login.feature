
Feature: Login Functionality

  @Regression
  Scenario: Login with valid username and password

    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
