package com.qa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleClass 
{
	static WebDriver driver;

	@Test
	public void main()
	{
	   WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   driver.get("http://www.google.com");
	   driver.manage().window().maximize();
	   driver.quit();
	}

}
