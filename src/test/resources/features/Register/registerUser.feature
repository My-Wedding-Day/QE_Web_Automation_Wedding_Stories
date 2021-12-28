@RegisterUser
Feature: Register
  As a Wedding Stories
  I want to Register Account as A User
  So that I can login on Website Wedding Stories

  Scenario: Register user Success
    Given I am on the register page
    When I enter my username email and password correctly
    And I click Register button
    Then I am Successfully registered my Account