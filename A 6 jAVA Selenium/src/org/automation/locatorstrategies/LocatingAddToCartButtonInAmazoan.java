package org.automation.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartButtonInAmazoan {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button['Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise eairbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Noise Newly Launched Buds Nuvo in-Ear ') and contains(text(),'Jet Black')]/../../../..//button")).click();
		driver.findElement(By.xpath("//div[contains(@id,'cart')]")).click();
	}

}
