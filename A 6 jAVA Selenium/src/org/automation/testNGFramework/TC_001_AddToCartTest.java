package org.automation.testNGFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.automation.testNGFramework.MyListners.class)
public class TC_001_AddToCartTest extends BaseTest
{
	@Test
	public void addToCart()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../../..//input")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}

}
