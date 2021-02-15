Feature: Search functionality scenarios

@Search @One
Scenario: Verify whether the user is able to search for products
	Given I launch the application
	When I search for a product "iPhone"
	Then I should see the product in the search results

@Search @Two	
Scenario: Verify whether the user is informed when the product being searched is not available
	Given I launch the application
	When I search for a product "laptop"
	Then I should see the message informing that "There is no product that matches the search criteria."