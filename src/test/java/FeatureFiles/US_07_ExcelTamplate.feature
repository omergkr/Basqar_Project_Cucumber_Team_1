Feature: Reports_SetupReports_ExcelTemplate


  Background:
    Given Navigate to basqar
    When Enter username and password and  click Login button
    Then User should login successfully

  Scenario: US_07 TC_01
    When click on element with name
    Then BudgetExcelTemplate page title control

  Scenario: US_07 TC_02
    When click on element with name
    Then Create a new Budget Excel Template name as "gulNewExcelTemplete" and period count as "12"
    And Success message should be displayed

  Scenario: US_07 TC_03
    When click on element with name
    Then Create a new Budget Excel Template name as " " and period count as " "
    And Save Button is disable


  Scenario: Us_07 Tc_04
    When click on element with name
    Then Create a new Budget Excel Template name as "gulNewExcelTemplete" and period count as "12"
    And Error message should be displayed


  Scenario:  Us_07 Tc_06
    When click on element with name
    When User edit the "gulNewExcelTemplete" to "AylnNewExcelTemplete"
    Then Message: your process has been successfully done

  Scenario:  Us_07 Tc_05
    When click on element with name
    When User delete the "AylnNewExcelTemplete"
    Then Message: your process has been successfully done


  Scenario:  Us_07 Tc_07
    When click on element with name
    Then Check aktiv radio button clickable or not
    Then Message: your process has been successfully done


  Scenario:  Us_07 Tc_08
    When click on element with name
    When When searching by  name as "selamlar"
    Then Check list with listname as "namelist" and searchtext as "selamlar"

