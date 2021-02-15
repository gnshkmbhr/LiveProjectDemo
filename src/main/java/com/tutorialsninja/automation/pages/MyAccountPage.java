package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {

	@FindBy(xpath="//a[contains(.,'Register for an affiliate account')]")
	public static WebElement RegisterAffilicateAccount;
}
