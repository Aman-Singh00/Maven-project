package com.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_AddToCArt {

		
		@Test
		public void addToCart() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Log")).click();
			driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("ak6838883@gmail.com");
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Aman@123");
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			WebElement add = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", add);
			add.click();
			driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
	
			driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
			
			driver.findElement(By.xpath("//button [@id='checkout']")).click();
			
			driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
			
			driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
			
			driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
			
			driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
			
			driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
			
			driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
			
			
			driver.findElement(By.xpath("//a[text()='Click here for order details.']")).click();
			
			
	
			
			driver.close();
			
			
			
			
			
			
			
			
		}
		
		

	}


