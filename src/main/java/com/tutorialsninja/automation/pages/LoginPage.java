package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement emailIdField;
	
	@FindBy(id="input-password")
	public static WebElement passwordField;

	@FindBy(css="input[type=\"submit\"][value=\"Login\"]")
	public static WebElement LoginButton;
	
	@FindBy(linkText="Warning: No match for E-Mail Address and/or Password.")
	public static WebElement MainWarningError;

	public static void doLogin(String email, String password)
	{
		   Elements.TypeText(LoginPage.emailIdField,email);
		   Elements.TypeText(LoginPage.passwordField,password);
		   Elements.click(LoginPage.LoginButton);
	}
	
}
