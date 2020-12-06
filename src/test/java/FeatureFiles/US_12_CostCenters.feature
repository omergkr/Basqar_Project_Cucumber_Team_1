Feature: Login Functionality

  Background:
    Given Navigate to basqar for Cost Center
    When Enter username and password and  click Login button for Cost Center

    Given Navigate to Cost Centers page


  Scenario: US_12 TC_01 (Go to Cost Centers page)
    Then CostCenters page title control

  Scenario: US_12 TC_02 (Creat a Cost Centers)
    When Click add button
    Then Enter name as "Fatih" as code "akar" as order no "867"
    Then Creat a Cost Centers Success message should be displayed

  Scenario: US_12 TC_03 (Cost Center Delete)

    When   User can Cost Center delete the "Fatih"
    Then Cost Center Success delete message should be displayed

  Scenario: US_12 TC_04 (Cost Center edit)
    When User Cost Center edit the "holoe" to "akmazlar"
    Then Success Edit message should be displayed











