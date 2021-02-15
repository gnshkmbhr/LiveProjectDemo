package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.SearchPage;

import cucumber.api.java.en.*;

public class Search {
	
	SearchPage searchPage = new SearchPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String arg1) {
		
	    Elements.TypeText(SearchPage.searchField, arg1);
	    Elements.click(SearchPage.searchButton);
	    
	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results()  {
	    
		Assert.assertTrue(Elements.VerifyTextEquals(SearchPage.iphoneLink, "iPhone"));
	}
	
	@Then("^I should see the message informing that \"([^\"]*)\"$")
	public void i_should_see_the_message_informing_that(String arg1) {
	    
		Assert.assertTrue(Elements.isDisplayed(SearchPage.errorMessage));
	}
	
}
