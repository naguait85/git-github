package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateQuote {
	@FindBy(xpath="//img[@alt='Create Quote...']")
	private WebElement createdQuote;

	public WebElement getCreatedQuote() {
		return createdQuote;
	}
	
	

}
