package com.ArtiGh_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPom {
	
	@FindBy(how=How.XPATH,using="//span[text()='Your Cart']") private WebElement ShoppingBag;
	@FindBy(how=How.XPATH,using="//button[@id='checkout']") private WebElement Checkout;
	
	public WebElement getShoppingBag() {
		return ShoppingBag;
	}
	public WebElement getCheckout() {
		return Checkout;
	}
	
	
}
