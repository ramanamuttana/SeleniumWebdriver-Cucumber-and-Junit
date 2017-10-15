Feature: The facebook scenario

@tag1
Scenario:Login with valid credentials
  Given Open Firefox and open the Facebook page
  When I enter username and Password  
  Then I ahave to be on my home page