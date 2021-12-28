@ProfileUser
Feature: View Profile User
  As a User
  I want to see my profile
  So i can see username, email and password

  Scenario: View Profile Success
    Given I on the login page
    When I enter email and password correctly
    And I click Log in button
    And I click logo avatar user
    And I click profile
    Then I am redirected to profile user
