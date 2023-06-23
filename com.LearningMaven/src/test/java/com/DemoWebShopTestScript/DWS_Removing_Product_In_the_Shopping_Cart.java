package com.DemoWebShopTestScript;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import PomRepository.Books_Page;
import PomRepository.LoginPage;
import PomRepository.ShoppingCartPage;
import PomRepository.WelcomePage;

public class DWS_Removing_Product_In_the_Shopping_Cart extends Base_Test {
	
	
	@Test
	public void removingProduct() throws InterruptedException
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.loginClick();
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail("ak6838883@gmail.com");
		lp.enterPassword("Aman@123");
		lp.clickLoginButton();
		wp.clickHeaderBooksLink();
		Books_Page bp = new Books_Page(driver);
		bp.clickAddToCartButton();
		wp.shoppingCartLinkClick();
		Thread.sleep(2000);
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		Thread.sleep(2000);
		sp.clickCheckBox();
		Thread.sleep(2000);
		sp.clickOnUpdateShoppingCart();
	}

}
