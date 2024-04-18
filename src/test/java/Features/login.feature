Feature: Launch browser
@login
  Scenario: Open Chrome browser
    Given I Open the Chrome Browser
    Given Enter Username
    Then Enter Password
    Then click on login button
    Then click on add to cart button
   # Then click on Remove button
   Then click on cart button
   Then click on Checkout button
    