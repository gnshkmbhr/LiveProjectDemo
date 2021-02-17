package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.config.*;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.AddtocartPage;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.ShoppingCart;
import com.tutorialsninja.automation.pages.SuccessPage;

import cucumber.api.java.en.*;

public class OrderAnItemETE {
	
	PropertyFileReader propertyFileReader = new PropertyFileReader();
	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	AddtocartPage addtocartPage = new AddtocartPage();
	ShoppingCart shoppingCart = new ShoppingCart();
	CheckoutPage checkoutPage = new CheckoutPage();
	//Waits waits = new Waits();
	
	
	
	@Given("^I login to the application$")
	public void i_login_to_the_application() throws InterruptedException  {
	  
		Browser.openApplicationURL();
		HeaderSection.headerSectionBar();
		LoginPage.doLogin();
		
	}

	@When("^I add any product to bag and checkout$")
	public void i_add_any_product_to_bag_and_checkout() {
		
		Waits.waitUntilElementLocated(10,HeaderSection.shoppingCart);
		AddtocartPage.addtocartProcess();
		HeaderSection.shoppingCart();
		Elements.click(ShoppingCart.checkout);
	
	}

	@And("^I place an order$")
	public void i_place_an_order()  {
		
		//Waits.waitUntilElementLocated(5, CheckoutPage.firstname);
	//	CheckoutPage.checkoutOptions();
		CheckoutPage.placeOrderDetails();
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  
	{
		try {
		Waits.waitUntilElementLocated(10, SuccessPage.successLink);
		Assert.assertTrue(Elements.isDisplayed(SuccessPage.successLink));
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}