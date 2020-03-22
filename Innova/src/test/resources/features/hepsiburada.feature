# new feature
# Tags: optional
Feature: hepsiburada

  In order to find product that I would like to buy
  As a potential user
  I want to be able to list preferred brand products and add item to shopping basket

  @chrome
  Scenario: 1 Verify that user is able to display selected brand products add preferred item to the basket
    Given I launch hepsiburadaHomePage
    And I open fashionMenu and choose womenWatch
    When I filter products by Guess
    And I scroll down page to pagination and open second page
    And I get details of first product and open it
    And I verify product details if it is my selected list item or not
    Then I add product to my basket
    And I check my basket count and open it
    And I verify my basket product details if it is my selected list item or not










    