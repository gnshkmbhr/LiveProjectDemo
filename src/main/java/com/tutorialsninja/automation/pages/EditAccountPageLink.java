package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class EditAccountPageLink {
	
	public EditAccountPageLink()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(className="list-group-item")
	public static WebElement EditAccountLink;

}
