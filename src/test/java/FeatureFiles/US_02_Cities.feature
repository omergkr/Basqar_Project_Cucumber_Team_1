Feature: Create_Cities_and_Delete functionality test

  Scenario: Add new Cities
    Given go to website "https://test.basqar.techno.study"
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" login click
    Then Check for successful login
    And Select cities page

  Scenario: Add new Cities
    When Add new
    Then Enter new City slect Country "Russia" and city Name "h" Save click
   And check for "created"

  Scenario:Delete a Cities
    When Deletion process "h"
    And check for "successfully"














