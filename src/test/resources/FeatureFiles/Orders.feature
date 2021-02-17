Feature: Scenarios related to placing order

@Order
Scenario: Verify whether the user is able to place the orders
	Given I login to the application
	When I add any product to bag and checkout
	And I place an order
	Then I should see that the order is placed successfully