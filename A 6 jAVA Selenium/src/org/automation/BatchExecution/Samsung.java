package org.automation.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Samsung {
	@Test
	public void launchingS23()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/smartphones/galaxy-s23/buy/");
		Reporter.log("launched s23",true);
	}
	
	@Test
	public void launchingS24()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/smartphones/galaxy-s24-ultra/");
		Reporter.log("launched s24",true);
	}


}
