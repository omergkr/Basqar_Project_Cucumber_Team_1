Feature: Subject functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and  click Login button
    And  Navigate to subject page

  Scenario: US_4 TC_01
    Then Subject page title control


  Scenario: US_4 TC_02
    Then  Create a new Subject name as "grup1" and code as "1234"


  Scenario: US_4 TC_03
    Then  Create a new Subject name as "Grup1" and code as "063"
    And new subject error message should be displayed

  Scenario: US_4 TC_04
    When  User edit subject the "Grup1" to "Grup1234"


  Scenario: US_4 TC_05
    Then  user delete "grup1234"


  Scenario: US_4 TC_06
    Then  Click subject activ or inactiv


  Scenario: US_4 TC_07
    Then  When searching by subject name as "grup1"
    Then Check list with subject listname as "namelist" and searchtext as "grup1"


  Scenario: US_4 TC_08
    Then user subject category should not be deleted
    When When searching by Subject Category name as "tester12"
    Then  User not be subject deleted as "tester12"