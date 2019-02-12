package com.ttny.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
	
	public static void main(String[]args) {
		

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Facebook - Log In or Sign Up")) {
			System.out.println("test pass");
		}else
			System.out.println("test fail");
			
	
		
		
}
}