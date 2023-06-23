package com.DemoWebShopTestScript;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import PomRepository.LoginPage;
import PomRepository.WelcomePage;

public class DWS_Community_Poll extends Base_Test{

	@Test
	public void communityPoll() {
		WelcomePage wp = new WelcomePage(driver);
//		wp.loginClick();
		
//		LoginPage lp = new LoginPage(driver);
//		lp.enterEmail("ak6838883@gmail.com");
//		lp.enterPassword("Aman@123");
//		lp.clickLoginButton();
		
		
		wp.clickExcellentRadioButton();
		wp.clickGoodRadioButton();
		wp.clickPoorRadioButton();
		wp.clickVeryBadRadioButton();
		wp.clickVoteButton();
		
		
	}
}