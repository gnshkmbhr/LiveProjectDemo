package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class AddtocartPage {

	public AddtocartPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(css="input[type=\"text\"][name=\"search\"]")
	public static WebElement searchField;
	
	@FindBy(css="span[class=\"input-group-btn\"]")
	public static WebElement searchButton;
	
	@FindBy(xpath="//button[contains(.,'Add to Cart')]")
	public static WebElement addtoCart;
	
	public static void addtocartProcess()
	{
		Elements.TypeText(AddtocartPage.searchField, "Samsung SyncMaster 941BW");
		Elements.click(AddtocartPage.searchButton);
		Elements.click(AddtocartPage.addtoCart);
	}
	
}
