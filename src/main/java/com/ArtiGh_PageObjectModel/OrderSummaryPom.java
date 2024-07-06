package com.ArtiGh_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryPom {

	@FindBy(how=How.XPATH,using="//span[text()='Checkout: Overview']") private WebElement Overview;
	@FindBy(how=How.XPATH,using="//button[@id='finish']") private WebElement FinishBtn;
	
	public WebElement getOverview() {
		return Overview;
	}
	public WebElement getFinishBtn() {
		return FinishBtn;
	}
	
	
}
