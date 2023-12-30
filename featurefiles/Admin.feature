
@tag
Feature: Admin Login
  I want to use this template  to validate the admin Login

  @tag1
  Scenario: Check admin Login with Valid Data
  Given i open broswer with the url "http://orangehrm.qedgetech.com"
  Then i should see login page
  When i enter username as "Admin"
  And i enter password as "Qedge123!@#"
  And i click login
  Then i should see admin module
  When i close browser
  
  
  @tag2
  Scenario Outline: check admin Login with inValid Data
  Given i open broswer with the url "http://orangehrm.qedgetech.com"
  Then i should see login page
  When i enter username as "<username>"
  And i enter password as "<password>"
  And i click login
  Then i should see erro mesage
   
   Examples: 
   |username|password|
   |Admin|axcd|
   |qeddcv|dvsd|
   |aSgf|sdgd|
  
  
  
  
  
 