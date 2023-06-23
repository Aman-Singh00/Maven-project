package com.DemoWebShopTestScript;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import PomRepository.Jewelry_Page;
import PomRepository.LoginPage;
import PomRepository.Select_jewelry_product_page;
import PomRepository.ShoppingCartPage;
import PomRepository.WelcomePage;
import PomRepository.Wishlist_Page;

public class Add_product_to_cart_In_Wishlist extends Base_Test{
	
	
	@Test
	public void wishlistProduct()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.loginClick();
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail("ak6838883@gmail.com");
		lp.enterPassword("Aman@123");
		lp.clickLoginButton();
		wp.clickHeaderJewelryLink();
		Jewelry_Page jp = new Jewelry_Page(driver);
		jp.clickOnDiamondProduct();
		Select_jewelry_product_page sp = new Select_jewelry_product_page(driver);
		sp.clickAddToWishlistButton();
		wp.wishlistClick();
		Wishlist_Page tp = new Wishlist_Page(driver);
		tp.clickAddToCartCheckBox();
		tp.clickAddToCartButton();
		
	}

}
