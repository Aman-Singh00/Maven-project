package com.DemoWebShopTestScript;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import PomRepository.Register_Page;
import PomRepository.WelcomePage;


public class DWS_Register_Test_Case extends Base_Test {
	
	@Test
	public void register()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.registerClick();
		Register_Page rp = new Register_Page(driver);
		rp.clickMaleRadioButton();
		rp.enterFirstName("Aman");
		rp.enterlastName("Singh");
		rp.enterEmail("akka123@gmail.com");
		rp.enterPassword("Ak@123");
		rp.enterConfirmPassword("Ak@123");
		rp.clickRegisterButton();
		
	}

}
