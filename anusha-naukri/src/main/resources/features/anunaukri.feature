@naukri_Feature
Feature: naukri website

@tc01_login
Scenario: 
check that the user can login naukri account
	
Given  user launched the chrome browser 
When  user opens naukri homepage 
Then user clicks login 

@tc02_more
Scenario: 
check that the user can click more and move to any field
	
Given  user can launched the chrome browser 
When  user opens the naukri homepage  
Then user clicks login button
And  user can click more and move to any field	

@tc03_HR
Scenario: 
check that the user is able to follow hr
	
Given  user  launchs the chrome browser to follow hr
When  user opens the naukri homepage for hr
When user logins to naukri page
Then user applys filter

@tc04_search_recruiters
Scenario: 
check that the user can search for recruiters
	
Given  user launched the chrome browser for search_recruiters scenario
When user launches naukri homepage
When user login the naukri page
Then the user can go to recruiters
	
