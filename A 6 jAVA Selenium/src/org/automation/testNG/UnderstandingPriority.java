package org.automation.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnderstandingPriority {
	@Test(priority = 1)
	public void launchingKalkiFashion()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.kalkifashion.com/");
	}
	
	@Test(dependsOnMethods = {"launchingKalkiFashion" , "launchingFullyFilmy"})
	public void launchingPurplle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
	}
	
	@Test(priority = 10)
	public void launchingFullyFilmy()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fullyfilmy.in/");
	}



}
