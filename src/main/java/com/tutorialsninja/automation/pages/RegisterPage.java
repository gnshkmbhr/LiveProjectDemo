package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	DataTable datatable;

	public RegisterPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement FirstName;
	
	@FindBy(id="input-lastname")
	public static WebElement LastName;
	
	@FindBy(id="input-email")
	public static WebElement EmailID;

	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(id="input-confirm")
	public static WebElement ConfirmPassword;
	
	@FindBy(name="agree")
	public static WebElement PrivacyPolicy;
	
	@FindBy(css="input[type=\"submit\"][value=\"Continue\"]")
	public static WebElement Continue;
	
	@FindBy(linkText="Register")
	public static WebElement RegisterBreadCrumb;
	
	@FindBy(css="input[id=\"input-firstname\"]+div")
	public static WebElement FirstNameWarning;
	
	@FindBy(css="input[id=\"input-lastname\"]+div")
	public static WebElement LastNameWarning;
	
	@FindBy(css="input[id=\"input-email\"]+div")
	public static WebElement EmailIDWarning;
	
	@FindBy(css="input[id=\"input-telephone\"]+div")
	public static WebElement TelephoneWarning;
	
	@FindBy(css="input[id=\"input-password\"]+div")
	public static WebElement PasswordWarning;
	
	@FindBy(css="div[class$=\"alert-dismissible\"]")
	public static WebElement MainWarning;
	
	@FindBy(css="input[name=\"newsletter\"][value=\"1\"]")
	public static WebElement SubscribeYesButton;
	
	public static void enterAllDetails(DataTable datatable,String dataType)
	{
		Map<String,String> map = datatable.asMap(String.class, String.class);
		
		Elements.TypeText(RegisterPage.FirstName, map.get("FirstName"));
		Elements.TypeText(RegisterPage.LastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.Telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.Password, map.get("Password"));
		
		if(dataType.equalsIgnoreCase("duplicate"))
			Elements.TypeText(RegisterPage.EmailID, map.get("EmailID"));
		else
			Elements.TypeText(RegisterPage.EmailID, System.currentTimeMillis()+map.get("EmailID"));
			
	}		
}
