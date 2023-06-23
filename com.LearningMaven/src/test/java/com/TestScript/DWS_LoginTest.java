package com.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DWS_LoginTest {

	@DataProvider(name = "LoginData")
	public Object[][] Logindata() {
		Object[][] data = new Object[1][2];
		data[0][0] = "ak6838883@gmail.com";
		data[0][1] = "Aman@123";
		return data;
	}

	@Test(dataProvider = "LoginData")
	public void Login(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.close();
	}

}
