
Feature: Sign In Test
  As a user I want to sign into Automation practice website
  Background:
  Given I am at homepage
    When I click on sign in link
  Scenario: User should navigate to sign in page successfully

    Then I should see the message AUTHENTICATION

  Scenario Outline:user should  verify the error message with invalid credentials

    When I click on sign in link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on Sign In button
    Then I should see the error message "<errorMessage>"

    Examples:
      | email          | password | errorMessage               |
      |                | 123455   | An email address required. |
      | abfd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |
@sanity
  Scenario: User should login successfully with valid credentials

    When I enter valid email
    And I enter valid password
    And I click on Sign In button
#    Then I should see Sign out link

  Scenario: User should logout successfully

    When I enter valid email
    And I enter valid password
    And I click on Sign In button
    And I click on Sign out link
    Then I should see Sign In link
