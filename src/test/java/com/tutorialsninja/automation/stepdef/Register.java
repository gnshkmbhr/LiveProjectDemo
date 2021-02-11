package com.tutorialsninja.automation.stepdef;


import org.junit.Assert;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.EditAccountPageLink;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;



public class Register {
	
	HeaderSection headerSection = new HeaderSection();
	RegisterPage registerPage = new RegisterPage();
	EditAccountPageLink editAccountPage = new EditAccountPageLink();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	   
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^Navigate to Account Registration page$")
	public void navigate_to_Account_Registration_page()  {
	    
		Elements.click(HeaderSection.MyAccount);
		Elements.click(HeaderSection.Register);
	}

	@When("^I provide all the personal details$")
	public void i_provide_all_the_personal_details(DataTable datatable,String dataType) {
		
	    RegisterPage.enterAllDetails(datatable,"unique");
	}

	@And("^Select the privacy policy$")
	public void select_the_privacy_policy()  {
	    
		Elements.click(RegisterPage.PrivacyPolicy);
	}

	@And("^Click on Continue button$")
	public void click_on_Continue_button()  {
		
		Elements.click(RegisterPage.Continue);   
	}

	@Then("^I should see new user account has been successfully created$")
	public void i_should_see_new_user_account_has_been_successfully_created()  {
	    
		Assert.assertTrue(Elements.isDisplayed(EditAccountPageLink.EditAccountLink));	
	}	
	
	@Then("^I should see that the user account is not created$")
	public void i_should_see_that_the_user_account_is_not_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.RegisterBreadCrumb));
	
	}

	@And("^I should see the error message informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_message_informing_the_user_to_fill_the_mandatory_fields() {
		
		Elements.isDisplayed(RegisterPage.FirstNameWarning);
		Elements.isDisplayed(RegisterPage.LastNameWarning);
		Elements.isDisplayed(RegisterPage.EmailIDWarning);
		Elements.isDisplayed(RegisterPage.TelephoneWarning);
		Elements.isDisplayed(RegisterPage.PasswordWarning);
		Elements.isDisplayed(RegisterPage.MainWarning);
	}
	
	@And("^Select newsletter options$")
	public void select_newsletter_options() {
	 
		Elements.clickOnlyIfElementPresent(RegisterPage.SubscribeYesButton);
	}
	
	@When("^I provide the below duplicate details$")
	public void i_provide_the_below_duplicate_details(DataTable datatable) {
		
	 RegisterPage.enterAllDetails(datatable, "duplicate");
	 
	}

	@Then("^I should see the user is restricted from creating duplicate account$")
	public void i_should_see_the_user_is_restricted_from_creating_duplicate_account() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.MainWarning, "Warning: You must agree to the Privacy Policy!"));
	}
}
