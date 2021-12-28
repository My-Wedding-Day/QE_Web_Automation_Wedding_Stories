@paymentuser
Feature: payment Order User
  as a user of Wedding Stories
  I want to payment my Order History
  So I can upload valid payment


  Scenario: Successfully user upload valid payment
    Given I at the login page user to see list payment
    When I input valid email and valid password and the click login
    When I redirected to Home Page and go to History Order
    When I click payment
    Then I redirected to upload valid payment