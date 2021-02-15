Feature:Login functionality scenarios

@Login @One
Scenario:Verify whether the user is able to login with valid credentials
	Given I launch the application
	And I navigate to account login page
	When I login to application using Username "gnshkmbhr@gmail.com" and Password "kmbhrgnsh2775"
	Then I should see that the user is able to login successfully

@Login @Two
Scenario:Vefiry whether the user is not able to login with invalid credentials
	Given I launch the application
	And I navigate to account login page
	When I login to application using Username "gnsh275kmbhr@gmail.com" and Password "kmbhrhssj"
	Then I should see an error message that the credentials are invalid
	
@Login @Three
Scenario:Verfiy whether the user is not able to login wihout providing credentials
	Given I launch the application
	And I navigate to account login page
	When I login to application using Username "" and Password ""
	Then I should see an error message that the credentials are invalid
	