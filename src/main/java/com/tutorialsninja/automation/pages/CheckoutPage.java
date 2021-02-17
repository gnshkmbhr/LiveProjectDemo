package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	public CheckoutPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(css="input[type=\"text\"][name=\"firstname\"]")
	public static WebElement firstname;
	
	@FindBy(css="input[type=\"text\"][name=\"lastname\"]")
	public static WebElement lastname;
	
	@FindBy(css="input[type=\"text\"][name=\"address_1\"]")
	public static WebElement address;
	
	@FindBy(css="input[type=\"text\"][name=\"city\"]")
	public static WebElement city;
	
	@FindBy(css="input[type=\"text\"][name=\"postcode\"]")
	public static WebElement postalCode;
	
	@FindBy(xpath="//select[contains(@name,'country_id')]")
	public static WebElement country;
	
	@FindBy(xpath="//select[contains(@name,'zone_id')]")
	public static WebElement state;
	
	@FindBy(css="input[type='button'][value='Continue']")
	public static WebElement continueButton;
	
	@FindBy(id="button-payment-address")
	public static WebElement continueButtonofBillingDetails;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonofShippingAddreess;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueButtonofDeliveryMethod;
	
	@FindBy(name="agree")
	public static WebElement radioButtonforPaymentMethod;
	
	@FindBy(id="button-payment-method")
	public static WebElement continueButtonofPaymentMethod;
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrder;
	
	public static void checkoutOptions()
	{
		Elements.TypeText(CheckoutPage.firstname, "Ganesh");
		Elements.TypeText(CheckoutPage.lastname, "Kumbhar");
		Elements.TypeText(CheckoutPage.address, "Hadapsar");
		Elements.TypeText(CheckoutPage.city, "Pune");
		Elements.TypeText(CheckoutPage.postalCode, "44554");
		Elements.click(CheckoutPage.country);
		Elements.TypeText(CheckoutPage.state, "MH");
	}
	
	public static void placeOrderDetails()
	{
		Elements.click(CheckoutPage.continueButtonofBillingDetails);
		Elements.click(CheckoutPage.continueButtonofShippingAddreess);
		Elements.click(CheckoutPage.continueButtonofDeliveryMethod);
		Elements.click(CheckoutPage.radioButtonforPaymentMethod);
		Elements.click(CheckoutPage.continueButtonofPaymentMethod);
		Elements.click(CheckoutPage.confirmOrder);
	}
}
