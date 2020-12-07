Feature: Bank Accounts Functionality

  Background:
    Given Navigate to basqar
    Then  Enter username and password and  click Login button
  Scenario: US_11 TC_01
    When click on button with button name
      | firstSetup   |
      | parameters   |
      | bankAccounts |
    Then page validation
      | bankAccountstitle | Bank Accounts |


  Scenario: US_11 TC_02
    When click on button with button name
      | firstSetup   |
      | parameters   |
      | bankAccounts |
      | addbutton    |
    Then Send text with inputbox name
      | inputPositionName | omergoker6321  |
      | inputIban         | DD132321312321 |
    And click on button with button name
      | bankAccountcurrency |
      | usd                 |
    Then Send text with inputbox name
      | integrationCode | 632 |
    And click on button with button name
      | saveButton |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_11 TC_03
    When click on button with button name
      | firstSetup   |
      | parameters   |
      | bankAccounts |
      | addbutton    |
    Then Send text with inputbox name
      | inputPositionName | omergoker63212 |
      | inputIban         | DD132321223423 |
    And click on button with button name
      | bankAccountcurrency |
      | usd                 |
    Then Send text with inputbox name
      | integrationCode | 632 |
    And click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | bankAccountsNameSearch | omergoker63212 |
    And click on button with button name
      | searchButton |
      | editButton   |
    Then Send text with inputbox name
      | inputPositionName | omergokerrwe34 |
    And click on button with button name
      | saveButton |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_11 TC_04
    When click on button with button name
      | firstSetup   |
      | parameters   |
      | bankAccounts |
      | addbutton    |
    Then Send text with inputbox name
      | inputPositionName | omergoker5555  |
      | inputIban         | DD132321225555 |
    And click on button with button name
      | bankAccountcurrency |
      | usd                 |
    Then Send text with inputbox name
      | integrationCode | 655 |
    And click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | bankAccountsNameSearch | omergoker5555 |
    And click on button with button name
      | searchButton |
      | deletButton  |
      | yesButton    |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_11 TC_05
    When click on button with button name
      | firstSetup   |
      | parameters   |
      | bankAccounts |
    Then Send text with inputbox name
      | bankAccountsNameSearch | omer |
    And click on button with button name
      | searchButton |
    Then check to list with input text
      | namelist | omer |