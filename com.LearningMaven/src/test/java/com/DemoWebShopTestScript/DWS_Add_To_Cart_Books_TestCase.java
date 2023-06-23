package com.DemoWebShopTestScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;
import PomRepository.Books_Page;
import PomRepository.Checkout_Page;
import PomRepository.LoginPage;
import PomRepository.ShoppingCartPage;
import PomRepository.Thankyou_page;
import PomRepository.WelcomePage;

public class DWS_Add_To_Cart_Books_TestCase extends Base_Test{

	
	@Test
	public void books() throws InterruptedException, IOException
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.loginClick();
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail("ak6838883@gmail.com");
		lp.enterPassword("Aman@123");
		lp.clickLoginButton();
		wp.clickHeaderBooksLink();
		Books_Page bp = new Books_Page(driver);
		bp.clickonSortByDropdown();
		Select s = new Select(bp.getSortByDropdown());
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(2);	
		bp.clickAddToCartButton();
		wp.shoppingCartLinkClick();
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.clickontermsofservice();
		sp.clickOnCheckOutButton();
		Checkout_Page cp = new Checkout_Page(driver);
		cp.clickBillingAddressContinueButton();
		cp.clickShippingAddressContinueButton();
		cp.clickShippingMethodContinueButton();
		cp.clickPaymentMethodContinueButton();
		cp.clickPaymentInformationContinueButton();
		cp.clickConfirmOrderButton();
		Thread.sleep(2000);
		Thankyou_page tp = new Thankyou_page(driver);
		tp.clickonOrderDetails();
		//tp.clickOnContinueButton();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshots/order.png");
		FileHandler.copy(temp, trg);
		
		
	}
}
