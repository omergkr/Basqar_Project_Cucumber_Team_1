Feature: Test Country Deletion 3-4

  Scenario: Login
    Given go to website "https://test.basqar.techno.study"
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" login click
    Then Check for successful login

  Scenario:   Go to countries page
    And Select countries page
    Then Add new
    When Create new country name "SOMECOUNTRY" and  code "SOME12"

  Scenario: Go to Cities page
    And Select citiess page
    Then Add new
    Then Enter new City slect Country "SOMECOUNTRY" and city Name "Türkiye_Bir_Dünya_Ülkesi" Save click

    Scenario: Delete a Country
      Then Select countriess page
      Then Deletion process "SOMECOUNTRY"
      And check for "error"
      And quit
