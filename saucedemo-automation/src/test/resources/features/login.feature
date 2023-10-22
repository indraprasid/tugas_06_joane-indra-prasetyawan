Feature: Login

  @bddLoginValid
  Scenario: Verify the users are not able to login with valid credentials
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_sauce
    And User clicks the Login button
    Then User is redirected to the homepage

  @bddLoginInvalid
  Scenario: Verify the users are not able to login with invalid credentials
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the invalid password, i.e. secret
    And User clicks the Login button
    Then The system shows an error message

  @tdd
  Scenario Outline: Verify the users are able to login or not
    Given User already open the sauce demo site
    When User enters the <username> as username
    And User enters the <password> as password
    And User clicks the Login button
    Then Verify <status> as status

    Examples:
      | username      | password         | status  |
      | standard_user | secret_sauce     | success |
      | standard_user | secret           | failed  |
