package com.ArtiGh_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {
	
	@FindBy(how=How.XPATH,using="//span[text()='Products']") private WebElement Products;
	@FindBy(how=How.XPATH,using="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement Add;
	@FindBy(how=How.XPATH,using="//a[@class='shopping_cart_link']") private WebElement Cart;
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getAdd() {
		return Add;
	}
	public WebElement getCart() {
		return Cart;
	}
	
	
}
