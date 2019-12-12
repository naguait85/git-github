package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sub_prod {
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	private WebElement subproductnam;

	public WebElement getSubproductnam() {
		return subproductnam;
	}
	
}
