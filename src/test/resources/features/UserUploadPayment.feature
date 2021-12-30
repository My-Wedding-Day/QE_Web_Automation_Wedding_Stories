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
    When I upload valid payment "C:\Users\Asus\QE_Web_Automation_Wedding_Stories\src\test\resources\Payment\validPayment.jpg"
    Then I succes upload valid payment