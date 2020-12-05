Feature: Salary modifiers functionality

 Background:
    Given Navigate to basqar
    When Enter username and password and  click Login button
    Then  User should login successfully
    And Navigate to salary modifiers page


   Scenario: US_9 TC_1
     When click on element with name
     Then Salary Modifiers page title control
     Then  User should login successfully

  Scenario: US_9 TC_02
    When click on element with name
    Then  Create a Salary modifiers
    And Succes message should be displayed

  Scenario: US_9 TC_03
    When click on element with name
    Then  delete Salary Modifiers

  Scenario: US_9 TC_04
    When click on element with name
    Then  Edit Salary Modifiers

  Scenario: US_9 TC_05
    When click on element with name
    Then  search by description  Salary Modifiers