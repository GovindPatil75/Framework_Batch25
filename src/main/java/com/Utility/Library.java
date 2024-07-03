package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_Sendkeys(WebElement element ,String value ,String fieldname) {
		
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname+"==Value succefully send =="+value);
		}catch(Exception e) {
			test.log(Status.FAIL,e.getMessage());
		}
	}

    public static void custom_Click(WebElement element,String fieldname) {
		
		try {
			element.click();
			test.log(Status.PASS, "clicked succefully =="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL,e.getMessage());
		}
	}

}
