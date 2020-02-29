package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BasePage;



public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(name="email")
	public WebElement txtEmail;
	
	@FindBy(name="passwd")
	public WebElement txtPassword;
	
	@FindBy(name="SubmitLogin")
	public WebElement btnSignIn;
	
	
	public void signin(String username, String password) {
		txtEmail.sendKeys(username);
		txtPassword.sendKeys(password);
		btnSignIn.click();
	}
	
}
