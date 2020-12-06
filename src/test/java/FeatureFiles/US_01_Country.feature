Feature: Create_Country_and_Delete functionality test

  Scenario Outline: Add new country
    Given go to website "<website_address>"
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" login click
    Then Check for successful login
    And Select countries page
    When Add new
    Then Create new country name "2Ibra" and  code "d21"
    And check for "created"



    Examples:
      | website_address                   |
      | https://test.basqar.techno.study/ |

  Scenario: existing record control

    When Add new
    Then Create new country name "2Ibra" and  code "kHBby12"
    And check for "error"
    And close dialog window


  Scenario: Edit a country
    When Edit process old_name "2Ibra" new_name "2SECDA"
    And check for "updated"


  Scenario: Delete a country
    When Deletion process "2SECDA"
    And check for "deleted"




