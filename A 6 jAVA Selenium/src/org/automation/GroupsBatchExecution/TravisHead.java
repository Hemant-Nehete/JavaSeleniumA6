package org.automation.GroupsBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TravisHead {
	@Test(groups = {"BBL","International","IPL","SRH"})
	public void launchingWiki()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Travis_Head");
	}

}
