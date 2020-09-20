package com.qa.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsClass 
{
	static RemoteWebDriver driver;

	 @FindBys({@FindBy(name="firstname"),@FindBy(id="u_0_m")})
	 List<WebElement> un;
	
	 @FindAll({@FindBy(name="firstname"),@FindBy(id="u_0_m")})
	 List<WebElement> unAll;
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(new ByAll(By.name("firstname"),By.id("u_0_m"),By.xpath("//input[@name='firstname']"))).sendKeys("SRK");

		driver.findElement(new ByIdOrName("u_0_m")).sendKeys("SRK");
	
	    driver.findElement(new ByChained(By.id("u_0_l"),By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"), By.name("firstname"))).sendKeys("SRK");
		
		driver.findElement(By.ById.id("u_0_m")).sendKeys("SRK");
		
		driver.findElement(By.ByName.name("firstname")).sendKeys("SRK");
		  
		driver.findElementById("u_0_m").sendKeys("SRK");
		
		driver.findElementByName("firstname").sendKeys("SRK");
		
		
	   
	}

}
