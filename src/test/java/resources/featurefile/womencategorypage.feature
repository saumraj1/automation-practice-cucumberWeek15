Feature: Women Category
  As a user I want see products and its categories and should add items to cart
  Background:
  Given I am at homepage
  When I click on Women link
  Scenario: User should navigate and access Women category successfully

    Then I should see text "WOMEN"
@sanity
  Scenario Outline: Verify user should add product to the cart successfully

    When I select product "<product>"
    And I change quantity "<qty>"
    And I select size "<size>"
    And I select colour "<colour>"
    And I click on Add Cart
    Then I should see the message "Product successfully added to your shopping cart"
    And I click close button

    Examples:
      | product                                | qty | size | colour |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |


