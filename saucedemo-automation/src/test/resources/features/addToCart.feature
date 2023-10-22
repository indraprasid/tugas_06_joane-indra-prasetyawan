Feature: Cart

  @bddAddToCart
  Scenario: Verify the users are able to add the product to cart
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_sauce
    And User clicks the Login button
    And User is redirected to the homepage
    And User clicks Add to Cart button for the Sauce Labs Backpack product
    Then Verify the badge of cart is filled by number
    And Verify the Add to Cart button is changed to Remove button for the Sauce Labs Backpack product

  @bddRemoveFromCart
  Scenario: Verify the users are able to remove the product from cart
    Given User already open the sauce demo site
    When User enters the valid username, i.e. standard_user
    And User enters the valid password, i.e. secret_sauce
    And User clicks the Login button
    And User is redirected to the homepage
    And User clicks Add to Cart button for the Sauce Labs Backpack product
    And User clicks Remove button for the Sauce Labs Backpack product
    Then Verify the Remove button is changed to Add to Cart button for the Sauce Labs Backpack product