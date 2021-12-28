@LoginUser
Feature: Login
  As a Wedding Stories
  I want to see my Homepage
  So that I can see the package and book the package of wedding

  Scenario: Login Success with valid email valid password
    Given I am on the login page
    When I enter my email and password correctly
    And I click Login button
    Then I am redirected to the homepage and I redirected to homepage