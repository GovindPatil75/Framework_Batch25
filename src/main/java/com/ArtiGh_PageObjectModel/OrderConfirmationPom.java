package com.ArtiGh_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPom {
	
	@FindBy(how=How.XPATH,using="//h2[text()='Thank you for your order!']") private WebElement OrderConfirmed;

	public WebElement getOrderConfirmed() {
		return OrderConfirmed;
	}

	
}
