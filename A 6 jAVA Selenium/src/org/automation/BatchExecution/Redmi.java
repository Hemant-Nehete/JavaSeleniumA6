package org.automation.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Redmi {
	@Test
	public void launchingRedmi13()
	{   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mi.com/in/product/redmi-note-13-5g/");
		Reporter.log("launched redmi 13",true);
	}

}
