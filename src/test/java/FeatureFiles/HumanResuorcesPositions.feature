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
      | inputPositionName | orhangoker |
      | inputShortName    | orgkr      |
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
      | inputPositionName | orhanegoker1 |
      | inputShortName    | orgkr1       |
    When click on button with button name
      | saveButton |
      | addbutton  |
    Then Send text with inputbox name
      | inputPositionName | orhanegoker1 |
      | inputShortName    | orgkr1       |
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
      | inputPositionName | orhangoker4 |
      | inputShortName    | orgkr4      |
    When click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionNameSearch | orhangoker4 |
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
      | inputPositionName | orhangoker6 |
      | inputShortName    | orgkr6      |
    When click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionNameSearch | orhangoker6 |
    And click on button with button name
      | searchButton |
      | editButton   |
    Then Send text with inputbox name
      | inputPositionName | orhangoker66 |
      | inputShortName    | orgkr66      |
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
      | inputPositionName | orhangoker7 |
      | inputShortName    | orgkr7      |
    When click on button with button name
      | saveButton |
    Then Send text with inputbox name
      | PositionNameSearch | orhangoker7 |
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