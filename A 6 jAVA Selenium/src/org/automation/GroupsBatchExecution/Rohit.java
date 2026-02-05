package org.automation.GroupsBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rohit {
	@Test(groups = {"International","IPL"})
	public void launchingWiki()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Rohit_Sharma");
	}

}
