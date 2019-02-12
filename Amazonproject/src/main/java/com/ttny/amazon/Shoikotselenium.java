package com.ttny.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoikotselenium {
	public static void main(String[]args) {
WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='nav-a nav-a-2']")).click();
		driver.findElement(By.xpath("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("alamsam476@gmail.com");
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("zunaira2015");
		driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
