Feature: Login

Scenario: Search Valid Product
	Given User Launch Chrome Browser
	When User opens URL "https://tutorialsninja.com/demo/"
	And  User Click on My Account Button
	And User click Login Button
	And User enters Email as "yoyoyo@gmail.com" and Password as "yoyoyo"
	And Click On Login
	And Enter HP product Nam
	And Click on Search Button
	Then Prodcut "HP LP3065" should appear
	And close Browser
	 