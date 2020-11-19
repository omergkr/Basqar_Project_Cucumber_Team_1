Feature: Human Resources Position Salary Functionality

  Background:

    Given Navigate to basqar
    Then  Enter username and password and  click Login button

  Scenario: US_05 TC_01
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
    Then page validation
      | positionSalaryPageTitle | Position Salary |

  Scenario: US_05 TC_02
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker63 |
    And click on button with button name
      | saveButton |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_05 TC_03
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionSalaryName |  |
    And Check that the button is visible
      | saveButton |


  Scenario: US_05 TC_04
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker17 |
    And click on button with button name
      | saveButton |
      | addbutton  |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker17 |
    And click on button with button name
      | saveButton |
    Then Control to verification message
      | errorMessage | Error |

  Scenario: US_05 TC_05
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker113 |
    And click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionSalarayNameSearch | omergoker113 |
    And click on button with button name
      | searchButton |
      | deletButton  |
      | yesButton    |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_05 TC_06
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker356 |
    And click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionSalarayNameSearch | omergoker356 |
    And click on button with button name
      | searchButton |
      | editButton   |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker367 |
    And click on button with button name
      | saveButton |
    Then Control to verification message
      | containsmesaj | successfully |

#
  Scenario: US_05 TC_07
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker543 |
    And click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionSalarayNameSearch | omergoker543 |
    And click on button with button name
      | searchButton |
      | ectiveButton |
    Then Control to verification message
      | containsmesaj | successfully |
    And click on button with button name
      | ectiveButton |
    Then Control to verification message
      | containsmesaj | successfully |

  Scenario: US_05 TC_08
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionSalaryName | omergoker3165 |
    And click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionSalarayNameSearch | omergoker3165 |
    And click on button with button name
      | searchButton |
    When Click on an icon in a List
      | positionSalaryIcons | 0 |
    And click on button with button name
      | addButtonforSalarayHistory |
    Then Send text with inputbox name
      | experienceRange | 0-3 |
    When click on button with button name
      | openCalendar |
    And Click on an icon in a List
      | calendardates | 15 |
    Then Send text with inputbox name
      | salary | 45000 |
    When click on button with button name
      | currency |
    And Click on an icon in a List
      | currencytyps | 1 |
    When click on button with button name
      | salaryHistoryAddButton |
      | saveButton             |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_05 TC_09
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positionSalary      |
    Then Send text with inputbox name
      | PositionSalarayNameSearch | omer |
    And click on button with button name
      | searchButton |
    Then check to list with input text
      | namelist | omer |