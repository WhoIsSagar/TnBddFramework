Feature: Login

Scenario: Login With Valid Credentials
	Given User Launch Chrome Browser
	When User opens URL "https://tutorialsninja.com/demo/"
	And  User Click on My Account Button
	And User click Login Button
	And User enters Email as "yoyoyo@gmail.com" and Password as "yoyoyo"
	And Click On Login
	Then Login Page Title Should be "My Account"
	When User click on Logout 
	Then Logout Page Title should be "Account Logout"
	And close Browser
	 
Scenario Outline: Login With Valid Credentials Datadriven
	Given User Launch Chrome Browser
	When User opens URL "https://tutorialsninja.com/demo/"
	And  User Click on My Account Button
	And User click Login Button
	And User enters Email as "<email>" and Password as "<password>"
	And Click On Login
	Then Login Page Title Should be "My Account"
	When User click on Logout 
	Then Logout Page Title should be "Account Logout"
	And close Browser
	 
Examples:
  | email                  | password   |
  | yoyoyo@gmail.com       | yoyoyo     |
  | seleniumpanda@gmail.com | Selenium123 |