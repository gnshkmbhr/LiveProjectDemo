package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {

	public HeaderSection()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement MyAccount;
	
	@FindBy(linkText="Register")
	public static WebElement Register;
	
	@FindBy(linkText="Login")
	public static WebElement LoginOption;
	
	@FindBy(linkText="Shopping Cart")
	public static WebElement shoppingCart;
	
	public static void headerSectionBar()
	{
		Elements.click(HeaderSection.MyAccount);
		Elements.click(HeaderSection.LoginOption);
	}
	
	public static void shoppingCart() 
	{
		Elements.click(HeaderSection.shoppingCart);
	}
}
