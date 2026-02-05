package org.automation.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingIdFB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/login.php/");
	WebElement emailTextbox	= driver.findElement(By.id("email"));
	emailTextbox.sendKeys("nehetehemant");
	Thread.sleep(2000);
	emailTextbox.sendKeys("@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("2000004");
		driver.findElement(By.name("login")).click();
		*/
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("kgf");
	}

}
