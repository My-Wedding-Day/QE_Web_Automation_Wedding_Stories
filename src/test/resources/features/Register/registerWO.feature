@RegisterWO
Feature: Register functionality in Web Wedding Stories
  as a Wedding Organize
  i want to register on Web Wedding Stories
  so that i can see my dashboard

  Scenario: Register with valid data and complete
    Given I am open register Wedding Organizer page
    When I enter Bussiness Name ini nama wo
    And I enter Email iniwo13@gmail.com
    And I am enter Address jl jalan doang
    And I am choose city Jakarta
    And I am enter Phone Number 08190909090
    And I am enter Password '12345678'
    Then I am click button register
    And show alert message please verify successfully pop up

  Scenario: Register complete but email already registered
    Given I am open register Wedding Organizer page
    When I enter Bussiness Name 'ininamawo'
    And I enter Email 'iniwo11@gmail.com'
    And I am enter Address jl jalan doang
    And I am choose city Jakarta
    And I am enter Phone Number 081123456789
    And I am enter Password '12345678'
    Then I am click button register
    And show alert message 'request failed status code 400'

  Scenario: Register complete but Bussiness Name and Password be less than 8
    Given I am open register Wedding Organizer page
    When I enter Bussiness Name 'Wo aja'
    And I enter Email 'iniwo10@gmail.com'
    And I am enter Address jl jalan doang
    And I am choose city Jakarta
    And I am enter Phone Number 08199090901
    And I am enter Password '12345'
    Then I am click button register
    And show alert message 'cannot be less than 8!'

  Scenario: Register but email and password blank
    Given I am open register Wedding Organizer page
    When I enter Bussiness Name 'ininamawo2'
    And I am not input Email
    And I am enter Address jl jalan doang
    And I am choose city Jakarta
    And I am enter Phone Number 08190909902
    And I am not input Password
    Then I am click button register
    And I am Failed Register

  Scenario: Register but one space and then input valid email
    Given I am open register Wedding Organizer page
    When I enter Bussiness Name 'ininamawo4'
    And I enter Email ' inisatuspace@gmail.com'
    And I am enter Address jl jalan doang
    And I am choose city Jakarta
    And I am enter Phone Number 0819090390
    And I am enter Password 123456789
    Then I am click button register
    And show alert message 'Email is not valid!'

  Scenario: Register but one space and then input valid password
    Given I am open register Wedding Organizer page
    When I enter Bussiness Name 'ininamawo4'
    And I enter Email ' iniwo5@gmail.com'
    And I am enter Address jl jalan doang
    And I am choose city Jakarta
    And I am enter Phone Number 08190909076
    And I am enter Password  123456778
    Then I am click button register
    And show alert message 'Request failed with status code 400'