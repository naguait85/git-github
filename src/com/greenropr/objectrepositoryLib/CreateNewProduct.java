package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewProduct {
	@FindBy(name="productname")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}
	@FindBy(name="button")
	private WebElement savpro;

	public WebElement getSavpro() {
		return savpro;
	}

	
}
