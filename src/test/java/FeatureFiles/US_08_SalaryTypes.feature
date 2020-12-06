Feature: Login Functionality

  Background:
    Given Navigate to basqar for Salary Page
    When Enter username and password and  click Login button for Salary Page
    Given Navigate to Salary Types page


  Scenario: US_8 TC_01 (Go to Salary Types page)
    Then SalaryTypes page title control

  Scenario: US_8 TC_02 (Creat a Salary Types)

    When click add button
    Then Enter name as "FatihÇetinler" click User Type and Click Save Button for Salary Page
    Then Success message should be displayed for Salary Page

  Scenario: US_8 TC_03 (User have to a name add)
    When click add button
    Then User have to name add for Salary Page

  Scenario: US_8 TC_04 (Previously added  error message)

    When click add button
    Then Enter name as "Fatihakar4" click User Type and Click Save Button
    And Erros message should be displayed for Salary Page


  Scenario: US_8 TC_05 (Salary Types Delete)

    When   User can salary Types delete the "Fatihakar4"
    Then Success delete message should be displayed


  Scenario: US_8 TC_06 (Salary Types edit)
    When User can salary Types edit
    Then Success edit message should be displayed


  Scenario:  US_08 TC_07(User can a Salary Type activ or inactiv)

    When  Click activ or inactiv buttons of Salary Types
    Then  Success activ or inactiv message should be displayed










