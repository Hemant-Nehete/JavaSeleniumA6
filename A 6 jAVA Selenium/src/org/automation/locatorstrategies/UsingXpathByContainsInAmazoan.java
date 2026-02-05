package org.automation.locatorstrategies;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class UsingXpathByContainsInAmazoan {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for men");
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.xpath("//span[contains(text(),'8514 Zion E ')]")).click();
		}

	}

	


