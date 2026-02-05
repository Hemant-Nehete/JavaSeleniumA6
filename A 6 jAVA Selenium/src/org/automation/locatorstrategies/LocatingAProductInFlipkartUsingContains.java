package org.automation.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAProductInFlipkartUsingContains {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("Motorola edge 20 fusion");
	driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Motorola Edge 20 Pro 5G (Iridescent Cloud, 128 GB)')]")).click();
}
}
