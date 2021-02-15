package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SearchPage {
	
	public SearchPage()
	{
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(css="input[type=\"text\"][name=\"search\"]")
	public static WebElement searchField;
	
	@FindBy(css="span[class=\"input-group-btn\"]")
	public static WebElement searchButton;
	
	@FindBy(xpath="//a[contains(.,'iPhone')]")
	public static WebElement iphoneLink;
	
	@FindBy(xpath = "//p[contains(.,'There is no product that matches the search criteria.')]")
	public static WebElement errorMessage;
}
