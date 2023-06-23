package com.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningRegisterTest {
	
	
	
	@DataProvider(name="Testdata")
	public Object[][] registerData()
	{
		Object[][] data = new Object[1][5];
		
		data[0][0]= "Aman";
		data[0][1]="Singh";
		data[0][2]="amansingh123@gmail.com";
		data[0][3]="Aman@432";
		data[0][4]="Aman@432";
		return data;
	}
	
	@Test(dataProvider = "Testdata")
	public void Register(String FN,String LN,String Email,String Password,String CPassword)
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Registe")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CPassword);
		driver.findElement(By.id("register-button")).click();
		driver.close();
		
	}

}
