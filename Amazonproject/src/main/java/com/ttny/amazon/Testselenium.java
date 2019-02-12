package com.ttny.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		driver.manage().window().maximize();
		driver.findElements(By.xpath("(//*[@class='nav-action-inner'])[1]"));
		
	
		
		
		

	}

}
