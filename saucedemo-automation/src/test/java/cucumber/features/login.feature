Feature: Login page

  Scenario: Verify the users are able to login with valid credential
    Given User already open the sauce demo site.
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_sauce
    And User clicks the Login button
    Then The user is logged in successfully
    And Redirected to the Products page

  Scenario: Verify the users are not able to login with invalid credentials
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_saucedemo
    And User clicks the Login button
    Then The system shows an error message 'Epic sadface: Username and password do not match any user in this service'
    And The user is unsuccessfully logged in