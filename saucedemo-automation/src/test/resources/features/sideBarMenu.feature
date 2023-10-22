Feature: Side Bar Menu

  @bddAccessAbout
  Scenario: Verify the users able to click About through the side bar menu
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_sauce
    And User clicks the Login button
    And User is redirected to the homepage
    And User clicks Add to the side bar menu
    And User clicks About on the side bar menu
    Then Verify the users are redirected to the SauceLabs page