@adminApprove
Feature: Approve list payment user
  As a Admin Wedding Stories
  I want view payment user
  So that I can accept payment user

  Scenario: Successfully Admin Approve payment user
    Given I am the login page admin
    When I input valid email and valid password
    When I redirected to Home Page
    When I Click Dashboard
    When I choose user payment
    Then I successfully accept payment user
