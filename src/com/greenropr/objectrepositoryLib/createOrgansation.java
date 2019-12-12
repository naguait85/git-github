package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createOrgansation {
	@FindBy(name="accountname")
	private WebElement createOrganisation;

	public WebElement getCreateOrganisation() {
		return createOrganisation;
	}
	@FindBy(name="button")
	private WebElement savebutton;

	public WebElement getSavebutton() {
		return savebutton;
	}
	

}
