Feature: Human2

  Background:
    Given Navigate to basqar
    When Enter username and password and  click Login button
    Then User should login successfully


  Scenario: US_10 TC_01

    When HumannResources click on element with nameeE
    Then Human_Salary Constants page title controlLL

  Scenario Outline:US_10 TC_02 Create a Salary Constants
    When HumannResources click on element with nameeE
    When When User Create a SalaryCostans  name as "<SaCOName>" short name as "<SaCKey>" name s "<SaCValue>"name as Date sende as "<saCoValidFrom>"
    And  Messag:Succes message should be displayed

    Examples:
      | SaCOName | SaCKey | SaCValue |
      | elmaa     | Kalem | 500     |


  Scenario Outline:US_10 TC_03 User should be able to edit
    When HumannResources click on element with nameeE
    Then  User Edit the "<SaCOName>" to "Dolar"
    And  Messag:Succes message should be displayed

    Examples:
      | SaCOName |
      | elma    |


  Scenario Outline:US_10 TC_04 User should be able to delet
    When HumannResources click on element with nameeE


    Then  User Delet the "<SaCOName>"
    And  Messag:Succes message should be displayed

    Examples:
      | SaCOName |
      | Dolar    |


  Scenario:  Us_03 Tc_05  searching by  name, the results should be matched the search terms
    When HumannResources click on element with nameeE
    When  searching by  name as "Dolar"
    Then Check list with SaCOlistname as "namelist" and searchtext as "Dolar"


