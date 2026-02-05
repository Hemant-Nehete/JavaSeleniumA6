package org.automation.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWishListIconInFlipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys(" best phone under 5000",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Nokia 220 DS 4G']/../../..//*[name()='svg']")).click();
	}

}
////*[name()='svg' ]