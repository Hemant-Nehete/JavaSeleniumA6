package org.automation.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	@Parameters("bname")
	@Test
	public void launchAndNavigate(@Optional("chrome") String browserName)
	{
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
}
