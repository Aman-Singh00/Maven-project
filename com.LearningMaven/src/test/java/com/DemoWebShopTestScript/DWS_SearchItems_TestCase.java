package com.DemoWebShopTestScript;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import PomRepository.LoginPage;
import PomRepository.WelcomePage;

public class DWS_SearchItems_TestCase extends Base_Test {
	
	
	@Test
	public void search()
	{
		WelcomePage page = new WelcomePage(driver);
		page.loginClick();
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail("ak6838883@gmail.com");
		lp.enterPassword("Aman@123");
		lp.clickLoginButton();
		page.enterSearchitems("mobiles");
		page.searchClick();
	}

}
