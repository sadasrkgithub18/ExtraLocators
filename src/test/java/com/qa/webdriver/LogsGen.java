package com.qa.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogsGen 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.javatpoint.com");
		}
	
	@Test(priority=1)
	public void freeCrmTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Tutorials List - Javatpoint");
	}
	
	@Test(priority=2)
	public void freemCRMLogoTest()
	{
	    System.out.println("===================================");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Tutorials List - Javatpoint");
		System.out.println("===================================");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();	
	}
	
}
