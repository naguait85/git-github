package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.greenrope.genericlib.WebdrivercommonLib;

public class Home {
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement Organisation;
	
	public WebElement getOrganisation() {
		return Organisation;
	}

@FindBy(xpath="//a[text()='Products']")
private WebElement prod;
public WebElement getProd() {
	return prod;
}
@FindBy(xpath="//a[text()='More']")
private WebElement More;

public WebElement getMore() {
	return More;
	
}
//navigate to quote
@FindBy(xpath="//a[text()='Quotes']")
private WebElement Quote;

public WebElement getQuote() {
	return Quote;
}//navigate to the logout
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement logout;


@FindBy(xpath="//a[text()='Sign Out']")
private WebElement logoutBtn;

public WebElement getLogout() {
	return logout;
}

public WebElement getLogoutBtn() {
	return logoutBtn;
}
public void logoutfromAPP() {
	
	WebdrivercommonLib wLib =new WebdrivercommonLib();
	wLib.moveToElement(logout);
	logoutBtn.click();

}
}
