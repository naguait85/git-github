package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubOrg {
	@FindBy(xpath="//a[contains(text(),'HP')]")
	private WebElement suborg;

	public WebElement getSuborg() {
		return suborg;
	}

}
