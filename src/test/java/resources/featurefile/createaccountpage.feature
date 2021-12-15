Feature: Create Account Test
  As a user I want to create an account on Automation practice website
@sanity
  Scenario: User should create account successfully
    Given I am at homepage
    When I click on sign in link
    And I enter a new email
    And I click Create an Account
    And I select gender
    And I enter customer first name
    And I enter customer last name
    And I enter password
    And I select day of Birth
    And I select month of Birth
    And I select year of Birth
    And I enter first name
    And I enter last name
    And I enter Company
    And I enter Address One
    And I enter Address Two
    And I enter City
    And I enter State
    And I enter Post Code
    And I enter Country
    And I enter other details
    And I enter phone no
    And I enter mobile no
    And I enter alia
    And I click on register button
    Then I should see My Account


