package com.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazonpagefactory {
	
	
	private String url="https://www.amazon.com";
    private String uname="alamsam476@gmail.com";
    private String upass="zunaira2015";
    
    
    @FindBy(xpath="//*[@class='nav-a nav-a-2']")
    private WebElement ClickSignInButton;
    @FindBy(xpath="//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
    private WebElement UNameBox;
    @FindBy(xpath="//*[@class='a-input-text a-span12 auth-required-field']")
    private WebElement UPass;
    @FindBy(xpath="//*[@class='a-button-input']")
    private WebElement ClickSignIn;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public WebElement getClickSignInButton() {
		return ClickSignInButton;
	}
	public void setClickSignInButton(WebElement clickSignInButton) {
		ClickSignInButton = clickSignInButton;
	}
	public WebElement getUNameBox() {
		return UNameBox;
	}
	public void setUNameBox(WebElement uNameBox) {
		UNameBox = uNameBox;
	}
	public WebElement getUPass() {
		return UPass;
	}
	public void setUPass(WebElement uPass) {
		UPass = uPass;
	}
	public WebElement getClickSignIn() {
		return ClickSignIn;
	}
	public void setClickSignIn(WebElement clickSignIn) {
		ClickSignIn = clickSignIn;
	}
	
    
    
    
    
    
    
    
    
    
}