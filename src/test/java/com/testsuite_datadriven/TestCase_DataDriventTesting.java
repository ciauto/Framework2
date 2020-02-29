package com.testsuite_datadriven;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.HomePage;

public class TestCase_DataDriventTesting extends BaseClass {

	WebDriver driver;
	HomePage hp;
	
	

	@Test(dataProvider = "getData")
	public void Logintest(String myusername, String mypassword) {
	hp=new HomePage(driver);
	}

	
}
