Feature: Education_Setup_SubjectCategories


  Background:
    Given Navigate to basqar
    When Enter username and password and  click Login button
    Then User should login successfully

  Scenario: US_03 TC_01
    When click on element with name
    Then SubjectCategories page title control name


  Scenario: US_03 TC_02
    When click on element with name
    Then SubjectCategorie=Create a Subject name as "mavi" and code as "99"
    And  And= Succes message should be displayed


  Scenario: US_03 TC_03
    When  click on element with name
    Then  SubjectCategorie=Create a Subject name as " " and code as " "
    And   Add:Save Button is disable

  Scenario: US_03 TC_04
    When  click on element with name
    Then  SubjectCategorie=Create a Subject name as "mavi" and code as "99"
    And   !! Succes Error message should be displayed

  Scenario:  Us_03 Tc_05
    When click on element with name
    When  SubjectCategorie=User edit the "mavi" to "maviDünya"
    Then Messag should Subject Category successfully updated


  Scenario:  Us_03 Tc_06
    When click on element with name
    When SubjectCategorie=User delete the "Tester12"
    Then Messag should Subject Category successfully updated



  Scenario:  Us_03 Tc_07
    When click on element with name
    When SubjectCategorie=Click subject categoriy activ or inactiv
    Then  Messag should Subject Category successfully updated



  Scenario:  Us_03 Tc_08
    When click on element with name
    When SubjectCategorie searching by  name as "kelam"
    Then Should=Check list with listname as "namelist" and searchtext as "kelam"
