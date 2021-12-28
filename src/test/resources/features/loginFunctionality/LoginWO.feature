@LoginWO
Feature: Login WO functionality in Web Wedding Stories
  as a Wedding Organize
  i want to login on Web Wedding Stories
  so that i can see my profile

  Scenario: login with my valid email and password
    Given I am open login page Oraganize
    When I am enter valid email
    And I am enter valid password
    And I am click button Login
    Then I am redirected to profile WO

  Scenario: login with invalid email and password
    Given I am open login page Oraganize
    When I am enter invalid email 'bukanemail'
    And I am enter invalid password 'bukanpassword'
    And I am click button Login
    Then  I am failed to login

  Scenario: login with valid email and invalid password
    Given I am open login page Oraganize
    When I am enter valid email
    And I am enter invalid password 'bukanpassword'
    And I am click button Login
    Then  I am failed to login

  Scenario: login with invalid email and valid password
    Given I am open login page Oraganize
    When I am enter invalid email 'bukanemail'
    And I am enter valid password
    And I am click button Login
    Then  I am failed to login