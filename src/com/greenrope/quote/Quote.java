package com.greenrope.quote;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.greenrope.genericlib.Baseclass;
import com.greenrope.genericlib.FileLib;
import com.greenrope.genericlib.WebdrivercommonLib;
import com.greenropr.objectrepositoryLib.CreateNewProduct;
import com.greenropr.objectrepositoryLib.CreateQuote;
import com.greenropr.objectrepositoryLib.Home;

import com.greenropr.objectrepositoryLib.Product;
import com.greenropr.objectrepositoryLib.Quotes;
import com.greenropr.objectrepositoryLib.SubOrg;
import com.greenropr.objectrepositoryLib.Sub_prod;
import com.greenropr.objectrepositoryLib.createOrgansation;
import com.greenropr.objectrepositoryLib.imgonOorganisation;

public class Quote extends Baseclass {
	
	@Test()
	public void CreateQuotewithorganisation() throws Throwable{
		
		//read excel data
		String organisation = flib.getExcelData("Sheet1", 7, 4);
		String subject = flib.getExcelData("Sheet1", 7, 2);
		String product = flib.getExcelData("Sheet1", 7, 5); 
		String Quantity = flib.getExcelData("Sheet1", 7, 6);
		String stage = flib.getExcelData("Sheet1", 7, 3);
		String billstreet = flib.getExcelData("Sheet1", 7, 9);
		String shipstreet = flib.getExcelData("Sheet1", 7, 10);
		WebdrivercommonLib wlib=new WebdrivercommonLib();
		int x =wlib .getRanDomNum();
		String orgNAm =organisation+x;
		String subjNAm =subject+x;
		String prodNam =product+x;
		//navigate to the organization
		Home h = PageFactory.initElements(driver,Home.class);
		Thread.sleep(10000);
		h.getOrganisation().click();
		//navigate to the "+" organization
		Thread.sleep(5000);
		imgonOorganisation imgpage = PageFactory.initElements(driver,imgonOorganisation.class);
		imgpage.getImgonOrganisation().click();
		//navigate to the create organization
		createOrgansation org=PageFactory.initElements(driver,createOrgansation.class); 
		org.getCreateOrganisation().sendKeys(orgNAm);
		org.getSavebutton().click();
		Thread.sleep(10000);
		h.getProd().click();
		Thread.sleep(10000);
		Product p = PageFactory.initElements(driver,Product.class); 
		p.getProductBtn().click();
		CreateNewProduct cnp = PageFactory.initElements(driver,CreateNewProduct.class);
		cnp.getProduct().sendKeys(prodNam);
		cnp.getSavpro().click();
		//navigate to quote
		Thread.sleep(10000);
		WebElement element= h.getMore();
		wlib.moveToElement(element);
		//navigate to quote
		h.getQuote().click();
		/*navigate to create Quote*/
		CreateQuote q =PageFactory.initElements(driver,CreateQuote.class);
		q.getCreatedQuote().click();
		/*create a quote*/
		Quotes qu = PageFactory.initElements(driver,Quotes.class);
		qu.getSubjectEdt().sendKeys(subjNAm);
		qu.getBillstreet().sendKeys(billstreet);
		qu.getShipstreet().sendKeys(shipstreet);
		qu.getStage().sendKeys(stage);
		/*select organization*/
		qu.getSelectorg().click();
		wlib.switchTochildId();
		SubOrg so = PageFactory.initElements(driver,SubOrg.class);
		Thread.sleep(5000);
		so.getSuborg().click();
		wlib.accpetAlert();
		wlib.switchToparentId();
		qu.getSelecproductnam().click();
		wlib.switchTochildId();
	    Sub_prod spd = PageFactory.initElements(driver,Sub_prod.class);
	    spd.getSubproductnam().click();
	    wlib.switchToparentId();
		qu.getSaveBtn().click();
		
		
		
		
		
	}	
	}
	
	
	
	
	


