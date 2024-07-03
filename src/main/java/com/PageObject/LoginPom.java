package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='user-name']")
	private WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	private WebElement LoginButton;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}
