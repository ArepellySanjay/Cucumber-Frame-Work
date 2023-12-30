
@tag
Feature: UserRegistration Test
  I want to use this template for UserRegistration 

  @tag1
  Scenario: UserRegistration with Valid Data
  Given i open broswer with the url "http://orangehrm.qedgetech.com"
  Then i should see login page
  When i enter username as "Admin"
  And i enter password as "Qedge123!@#"
  And i click login
  Then i should see admin module 
  When i goto new userr registration 
  And i enter user rolee  as "ESS"
  And i enter employee id as "sanjay1"
  And i enter usernamee as "nitin"
  And i enter passwordd as "san123"
  And i enter confirmm password as "san123"
   And i click savee
   
   Then i should see new registered id in user registration list
   When i click logout
   Then i should see login page
   When i close browser
  
  
  
  
  
  
  
  
  