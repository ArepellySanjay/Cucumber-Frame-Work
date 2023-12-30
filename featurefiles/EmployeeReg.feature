
@tag
Feature: Employee Registration
  I want to use this template to validate Employee Registration 

  @tag1
  Scenario: check new employee registration with valid data
    Given i open broswer with the url "http://orangehrm.qedgetech.com"
    Then i should see login page
  When i enter username as "Admin"
  And i enter password as "Qedge123!@#"
  And i click login
  Then i should see admin module
    When i goto new employee registration page
    And i enter user as "raj"
    And i enter pass as "kumar"
    And i click save
    Then i should see registered employee in the employee list
    When i click logout
    Then i should see login page
    When i close browser
    