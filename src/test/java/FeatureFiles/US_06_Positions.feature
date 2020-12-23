@RegressionTest
Feature: Human Resources Positions Functionality

  Background:

    Given Navigate to basqar
    Then  Enter username and password and  click Login button


  Scenario: US_06 TC_01
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
    Then page validation
      | positionspagetitle | Positions |

  Scenario: US_06 TC_02
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionName | orhangoker23232 |
      | inputShortName    | orgkr23213      |
    And click on button with button name
      | saveButton |
    Then Control to verification message
      | containsmesaj | successfully |

  Scenario: US_06 TC_03
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionName |  |
      | inputShortName    |  |
    And Check that the button is visible
      | saveButton |


  Scenario: US_06 TC_04
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionName | orhanegoker122 |
      | inputShortName    | orgkr122       |
    When click on button with button name
      | saveButton |
      | addbutton  |
    Then Send text with inputbox name
      | inputPositionName | orhanegoker122 |
      | inputShortName    | orgkr122       |
    When click on button with button name
      | saveButton |
    Then Control to verification message
      | errorMessage | Error |

  Scenario: US_06 TC_05
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionName | orhangoker49 |
      | inputShortName    | orgkr49      |
    When click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionNameSearch | orhangoker49 |
    And click on button with button name
      | searchButton |
      | deletButton  |
      | yesButton    |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_06 TC_06
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionName | orhangoker69 |
      | inputShortName    | orgkr69      |
    When click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionNameSearch | orhangoker69 |
    And click on button with button name
      | searchButton |
      | editButton   |
    Then Send text with inputbox name
      | inputPositionName | orhangoker669 |
      | inputShortName    | orgkr669      |
    When click on button with button name
      | saveButton |
    Then Control to verification message
      | containsmesaj | successfully |


  Scenario: US_06 TC_07
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
      | addbutton           |
    Then Send text with inputbox name
      | inputPositionName | orhangoker79 |
      | inputShortName    | orgkr79      |
    When click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionNameSearch | orhangoker79 |
    And click on button with button name
      | searchButton |
      | ectiveButton |
    Then Control to verification message
      | containsmesaj | successfully |
    And click on button with button name
      | ectiveButton |
    Then Control to verification message
      | containsmesaj | successfully |

  Scenario: US_06 TC_08
    When click on button with button name
      | humanResources      |
      | humanResourcessetup |
      | positions           |
    Then Send text with inputbox name
      | PositionNameSearch      | orhangok |
      | PositionShortNameSearch | orgk     |
    And click on button with button name
      | searchButton |
    Then check to list with input text
      | namelist      | orhangok |
      | Shortnamelist | orgk     |