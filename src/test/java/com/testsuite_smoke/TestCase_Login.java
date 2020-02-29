package com.testsuite_smoke;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;

public class TestCase_Login extends BaseClass {
	
	HomePage hp;
	LoginPage lp;

	@Test
	public void Logintest() {
		app_logs.info("Entering username, password and sign on");
		hp=new HomePage(driver);
		hp.clickSignin();
		lp=new LoginPage(driver);
		lp.signin("naresh.busyqa@gmail.com", "training");
		
	}

}
