Feature: Subject functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and  click Login button
    Then  User should login successfully
    And  Navigate to subject page

    Scenario: US_4 TC_01
      When click on element with name
      Then Subject page title control


    Scenario: US_4 TC_02
      When click on element with name
      Then  Create a Subject name as "grup1" and code as "1234"
      And Succes message should be displayed

  Scenario: US_4 TC_03
    When click on element with name
    Then  Create a Subject name as "Grup1" and code as "1234"
    And error message should be displayed

  Scenario: US_4 TC_04
    When click on element with name
    When  User edit the "Grup1" to "Grup1234"
    Then Succes message should be displayed


  Scenario: US_4 TC_05
    When click on element with name
    Then  user delete "grup1"
    And Succes message should be displayed

  Scenario: US_4 TC_06
    When click on element with name
    Then  Click subject activ or inactiv
    And Succes message should be displayed


  Scenario: US_4 TC_07
    When click on element with name
    Then  When searching by  name as "grup1"
    Then Check list with listname as "namelist" and searchtext as "grup1"


  Scenario: US_4 TC_08
    When click on element with name
    Then user subject category should not be deleted
    When When searching by Subject Category name as "tester12"
    Then  user not be deleted as "tester12"
