package com.greenropr.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quotes {
	@FindBy(name="subject")
	private WebElement subjectEdt;

	public WebElement getSubjectEdt() {
		return subjectEdt;
	}
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img[@alt='Select']")
	private WebElement selectorg;

	public WebElement getSelectorg() {
		return selectorg;
	}
	@FindBy(name="bill_street")
	private WebElement billstreet;

	public WebElement getBillstreet() {
		return billstreet;
	}
	@FindBy(name="ship_street")
	private WebElement shipstreet;
	
	public WebElement getShipstreet() {
		return shipstreet;
	}
	@FindBy(name="quotestage")
	private WebElement stage;

	public WebElement getStage() {
		return stage;
		
	}
	
	@FindBy(xpath="//img[@title='Products']")
	private WebElement selecproductnam;
	public WebElement getSelecproductnam() {
		return selecproductnam;
	}
	@FindBy(name ="button")
	private WebElement saveBtn;

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	

}
