package com.ArtiGh_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetailsPom {
	
	@FindBy(how=How.XPATH,using="//span[text()='Checkout: Your Information']") private WebElement Information;
	@FindBy(how=How.XPATH,using="//input[@id='first-name']") private WebElement FirstName;
	@FindBy(how=How.XPATH,using="//input[@id='last-name']") private WebElement LastName;
	@FindBy(how=How.XPATH,using="//input[@id='postal-code']") private WebElement PostalCode;
	@FindBy(how=How.XPATH,using="//input[@id='continue']") private WebElement ContinueBtn;
	
	public WebElement getInformation() {
		return Information;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getPostalCode() {
		return PostalCode;
	}
	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	

}
