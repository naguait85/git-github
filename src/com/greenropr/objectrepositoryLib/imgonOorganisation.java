package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class imgonOorganisation {
	//navigate to the organisation
		@FindBy(xpath="//img[@alt='Create Organization...']")
		private WebElement imgonOrganisation;

		public WebElement getImgonOrganisation() {
			return imgonOrganisation;
		}
		
		
}
