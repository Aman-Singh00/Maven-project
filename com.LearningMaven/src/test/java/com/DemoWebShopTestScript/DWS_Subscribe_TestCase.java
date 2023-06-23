package com.DemoWebShopTestScript;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import PomRepository.WelcomePage;

public class DWS_Subscribe_TestCase extends Base_Test{
	
	@Test
	public void subscribe()
	{
		WelcomePage page = new WelcomePage(driver);
		page.enterNewsletterEmail("ak6838883@gmail.com");
		page.clickOnSubscribe();
		
	}

}
