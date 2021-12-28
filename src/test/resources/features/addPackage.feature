@addpackage
Feature: Add a Package
  as a Wedding Organizer
  I want to add a Package Wedding into my Profile
  So I can promote my wedding package on the Website

  Scenario: Successful Adding a Package into profile Wedding Organizer
    Given I am on the login page web
    When I click the login account as organizer
    When I input valid email and password
    When I click button sign in
    When I click avatar WO
    When I click my packages
    When I am redirected to My packages
    When I click New Package
    When I input complete and valid data    
    When I upload photo "C:\Users\Asus\Desktop\QE_Wedding_Stories_Web_Automation\src\test\resources\gambar\wedding.jpg"
    Then I am success add a package wedding