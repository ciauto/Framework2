package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BasePage;



public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement btnSignInHome;
	
	
	public void clickSignin() {

		btnSignInHome.click();
	}
	
}
