package com.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazonpagefactory.Amazonpagefactory;

public class GenericClass {

	WebDriver driver;
	Amazonpagefactory pf;
	
	public void getSetup() {
		System.setProperty("webriver.chrome.driver","webdriver.chrome.driver\",\"C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
driver=new ChromeDriver();
pf=PageFactory.initElements(driver,Amazonpagefactory.class);
driver.get(pf.getUrl());
driver.manage().window().maximize();}
	

public void signin() {
	pf.getClickSignInButton().click();
	pf.getUNameBox().sendKeys(pf.getUname());
	pf.getUPass().sendKeys(pf.getUpass());
	pf.getClickSignInButton().click();
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	






















	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

