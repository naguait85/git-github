package com.greenrope.genericlib;



import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdrivercommonLib {
	public void waitforpageToLoad(){
		Baseclass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void waitForExpElement(WebElement element) { 
		WebDriverWait wait= new WebDriverWait(Baseclass.driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	//public Random r = new Random();
	
	public void moveToElement(WebElement element) {
		Actions act = new Actions(Baseclass.driver);
		act.moveToElement(element).perform();
	}
	public int getRanDomNum() {
		Random random = new Random();
		int randomNum = random.nextInt(20000);
		return randomNum;
		
	}
	static String parentId;
	static String childId;
	public void switchTochildId() {
		Set<String>set = Baseclass.driver.getWindowHandles();
		Iterator<String>it = set.iterator();
		 parentId = it.next();
		  childId = it.next();
		  Baseclass.driver.switchTo().window(childId);	
	}
	public void switchToparentId() {
		Baseclass.driver.switchTo().window(parentId);	
		
	}
	
	public void select(WebElement element,String text) {
		Select sel1=new Select(element);
		sel1.selectByVisibleText("Rejected");
	}
	
	
	public void accpetAlert() {
		Alert alt =Baseclass.driver.switchTo().alert();
		alt.accept();
		
	}
	public void cancelAlert(String data) {
		Alert alt =Baseclass.driver.switchTo().alert();
		if(data.equals(alt.getText())) {
		  System.out.println("alertis verified==PASS");
		}
		alt.dismiss();
		
	}
		
	}

