package com.greenrope.genericlib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.greenropr.objectrepositoryLib.Home;

import com.greenropr.objectrepositoryLib.Login;


public class Baseclass {
public static WebDriver driver;
public FileLib flib = new FileLib();
@BeforeClass
public void configBC()throws Throwable {
	String BROWSER = flib.getpropertyFileData("browser");
	System.out.println("======Launch the Browser======");
	if(BROWSER.equals("Firefox")) {
		driver = new  FirefoxDriver();
	}else if(BROWSER.equals("Chrome")) {
		driver = new  ChromeDriver();
	}
}
	@BeforeMethod
	public void configBM()throws Throwable{	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String URL =flib.getpropertyFileData("Url");
		String USER=flib.getpropertyFileData("username");
		String PASSWORD=flib.getpropertyFileData("password");
		driver.manage().window().maximize();
		driver.get(URL);
		
		Login lpage = PageFactory.initElements(driver, Login.class);
		lpage.logintoAPP(USER, PASSWORD);
		
	}
	
	@AfterMethod
	public void configAM() {
		Home h = PageFactory.initElements(driver, Home.class);
		h.logoutfromAPP();

	}
		@AfterClass
		public void configAC() {
			driver.close();
		}
		
	
	
	
}


