package com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerfiyTC_001 extends BaseClass {
	
	@Test
	public void verifyLoginTest() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String username=excel.getStringTestData_Excel("LoginData", 0, 0);
		String password=excel.getStringTestData_Excel("LoginData", 0, 1);
		
		Library.custom_Sendkeys(login.getUsername(), username ,"Username");
		Library.custom_Sendkeys(login.getPassword(), password ,"Password");
		Library.custom_Click(login.getLoginButton() ,"Login button");
		
		//WebElement Username=Library.getExplictWait(driver, 5, login.getUsername());
		
		//Library.custom_Sendkeys(Username, username, "Username");
		
     Library.getExplictWait(driver, 6).
     until(ExpectedConditions.elementToBeClickable(login.getLoginButton()));
		
		
		
	}

}
