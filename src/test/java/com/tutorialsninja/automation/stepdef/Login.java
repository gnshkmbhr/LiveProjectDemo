package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.*;

public class Login {
	
	HeaderSection headersection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myaccountpage = new MyAccountPage();
	
	@And("^I navigate to account login page$")
	public void i_navigate_to_account_login_page()  {
		
		Elements.click(HeaderSection.MyAccount);
		Elements.click(HeaderSection.LoginOption);
	   
	}

	@When("^I login to application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_application_using_Username_and_Password(String email, String password)  {
	  
	   LoginPage.doLogin(email, password);
	}

	@Then("^I should see that the user is able to login successfully$")
	public void i_should_see_that_the_user_is_able_to_login_successfully()  {
		try {
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.RegisterAffilicateAccount));
	}
		catch(Exception e)
		{
			
		}
	}
	
	@Then("^I should see an error message that the credentials are invalid$")
	public void i_should_see_an_error_message_that_the_credentials_are_invalid() {
		
		try {
	    Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.MainWarningError,"Warning: No match for E-Mail Address and/or Password."));
		}
		catch(Exception e) {
			
		}
		}
}
