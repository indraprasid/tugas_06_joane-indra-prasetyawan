Feature: Checkout

  @bddFailedToCO
  Scenario: Verify the users are not able to checkout the product if the Your Information's fields are empty
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_sauce
    And User clicks the Login button
    And User is redirected to the homepage
    And User clicks Add to Cart button for the Sauce Labs Backpack product
    And Verify the badge of cart is filled by number
    And Verify the Add to Cart button is changed to Remove button for the Sauce Labs Backpack product
    And Verify the Sauce Labs Backpack product is available in the Cart
    And User clicks Checkout button
    And Verify users are redirected to the Checkout Your Information page
    And User clicks Continue button
    Then The system shows an error message First Name is required

  @tddSuccessToCO
  Scenario Outline: Verify the users are able to checkout the product if the Your Information's fields are empty
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_sauce
    And User clicks the Login button
    And User is redirected to the homepage
    And User clicks Add to Cart button for the Sauce Labs Backpack product
    And Verify the badge of cart is filled by number
    And Verify the Add to Cart button is changed to Remove button for the Sauce Labs Backpack product
    And Verify the Sauce Labs Backpack product is available in the Cart
    And User clicks Checkout button
    And Verify users are redirected to the Checkout Your Information page
    And User enters the <firstName> as firstName
    And User enters the <lastName> as lastName
    And User enters the <postalCode> as postalCode
    And User clicks Continue button
    And User is redirected to the Checkout Review page with Sauce Labs Backpack product
    And User clicks Finish button
    Then The system shows Thank you for your order

    Examples:
      | firstName | lastName | postalCode |
      | Marc      | Marquez  | 60188      |
