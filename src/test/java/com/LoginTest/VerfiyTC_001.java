package com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ArtiGh_PageObjectModel.*;
import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.ConfigDataProvider;
import com.Utility.Library;

public class VerfiyTC_001 extends BaseClass {
	
	@Test
	public void verifyLoginTest() throws Exception {
		
		//String username=excel.getStringTestData_Excel("LoginData", 0, 0); 
		//String password=excel.getStringTestData_Excel("LoginData", 0, 1);
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);  
		//Get Login data from config file
		 ConfigDataProvider config=new ConfigDataProvider();
		 String username=config.getUsername();
		 String password=config.getPassword();
		 Library.custom_Sendkeys(login.getUsername(), username ,"Username");
		 Library.custom_Sendkeys(login.getPassword(), password ,"Password");
		 Library.custom_Click(login.getLoginButton() ,"Login button");
				
		// verify home page
		HomePagePom home=PageFactory.initElements(driver, HomePagePom.class);
		boolean value = home.getProducts().isDisplayed();
		Assert.assertTrue(value);
		// add to cart
		home.getAdd().click();
		home.getCart().click();
		
		// verify cart
		CartPom cart=PageFactory.initElements(driver, CartPom.class);
		boolean value1 = cart.getShoppingBag().isDisplayed();
		Assert.assertTrue(value1);
		// checkout
		cart.getCheckout().click();
		
		// verify information
		PaymentDetailsPom payment=PageFactory.initElements(driver, PaymentDetailsPom.class);
		boolean value2 = payment.getInformation().isDisplayed();
		Assert.assertTrue(value2);
		
		// Add Information
		String Firstname=excel.getStringTestData_Excel("LoginData", 1, 0);
		String Lastname=excel.getStringTestData_Excel("LoginData", 1, 1);
		String Postalcode=excel.getStringTestData_Excel("LoginData", 1, 2);
		
		payment.getFirstName().sendKeys(Firstname);
		payment.getLastName().sendKeys(Lastname);
		payment.getPostalCode().sendKeys(Postalcode);
		payment.getContinueBtn().click();
		
		// verify order summary
		OrderSummaryPom summary=PageFactory.initElements(driver, OrderSummaryPom.class);
		boolean value3 = summary.getOverview().isDisplayed();
		Assert.assertTrue(value3);
		
		// place order
        summary.getFinishBtn().click();
		
        // verify that order is placed
		OrderConfirmationPom confirmed=PageFactory.initElements(driver, OrderConfirmationPom.class);
		boolean value4 = confirmed.getOrderConfirmed().isDisplayed();
		Assert.assertTrue(value4);

		
			
	}

}
