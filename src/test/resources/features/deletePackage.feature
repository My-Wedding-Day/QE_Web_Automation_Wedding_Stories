@deletepackage
Feature: Delete a Package
  as a Wedding Organizer
  I want to Delete a Package Wedding into my Profile
  So I can Delete my wedding package on the Website

  Scenario: Successfully Delete a Package into profile Wedding Organizer
    Given I am on the login page web wedding stories
    When I click the button login account as organizer
    When I am input valid email and password
    When I am click button Sign In
    When I am click avatar WO
    When I am click my packages
    When I am redirected to My all packages
    When I delete My package wedding
    Then I am success Delete a package wedding