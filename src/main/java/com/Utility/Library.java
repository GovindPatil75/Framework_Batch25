package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

   public static WebElement getExplictWait_elementToBeClickable(WebDriver driver,long time,WebElement element) {
    	
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
    return wait.until(ExpectedConditions.elementToBeClickable(element));
    
    
    }
    
   public static WebElement getExplictWait_visibilityOf(WebDriver driver,long time,WebElement element) {
   	
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	    return wait.until(ExpectedConditions.visibilityOf(element));
	    
	    
	    }
    
   public static WebDriverWait getExplictWait(WebDriver driver,long time) {
	   	
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait;
	   
	    }
    
    
    
    
    
}
