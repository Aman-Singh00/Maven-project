package com.DemoWebShopTestScript;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import PomRepository.Home_Page;
import PomRepository.LoginPage;
import PomRepository.WelcomePage;

public class DWS_Login_Logout_TestCase extends Base_Test{
	
	
	@Test
	public void loginLogout()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.loginClick();
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail("ak6838883@gmail.com");
		lp.enterPassword("Aman@123");
		lp.clickLoginButton();
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLogOutLink();
	}

}
