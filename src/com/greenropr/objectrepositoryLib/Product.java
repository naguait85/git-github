package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product {
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement productBtn;

	public WebElement getProductBtn() {
		return productBtn;
	}
}
