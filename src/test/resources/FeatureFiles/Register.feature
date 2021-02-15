Feature: Registration functionality scenarios

@Register @One
Scenario: Verify whether the user is able to register into the application by providing all the details
	Given I launch the application
	And Navigate to Account Registration page
	When I provide all the personal details
					|FirstName|Ganesh 					|
					|LastName |Kumbhar					|
					|EmailID  |gnshkmbhr@gmail.com		|
					|Telephone|1336499446 				|
					|Password |ganeshkumbhar27		    |
					
	And Select the privacy policy
	And Click on Continue button
	Then I should see new user account has been successfully created	
	
	@Register @Two
	Scenario: Verify whether the user is not allowed to register on skipping the mandatory fields
		Given I launch the application
		And Navigate to Account Registration page
		When Click on Continue button
		Then I should see that the user account is not created
		And I should see the error message informing the user to fill the mandatory fields
	
	@Register @Three				
	Scenario: Verify whether the user is able to register into the application while subscribing to newsletter
	Given I launch the application
	And Navigate to Account Registration page
	When I provide all the personal details
					|FirstName|Ganesh 					|
					|LastName |Kumbhar					|
					|EmailID  |gnshkmbhr@gmail.com		|
					|Telephone|1336499446 				|
					|Password |ganeshkumbhar27	     	|
	And Select newsletter options				
	And Select the privacy policy
	And Click on Continue button
	Then I should see new user account has been successfully created
	
	@Register @Four
	Scenario: Verify whether the user is able to register into the application with duplicate details
	Given I launch the application
	And Navigate to Account Registration page
	When I provide the below duplicate details
					|FirstName|Ganesh 					|
					|LastName |Kumbhar					|
					|EmailID  |gnshkmbhr@gmail.com		|
					|Telephone|1336499446 				|
					|Password |ganeshkumbhar27	     	|				
	And Select the privacy policy
	And Click on Continue button
	Then I should see the user is restricted from creating duplicate account
 