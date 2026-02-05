package org.automation.Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingOrangeHRM {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.findElement(By.xpath("//button[@title='My Timesheet']")).click();
		driver.findElement(By.xpath("//button[text()=' Edit ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("ACME Ltd - ACME Ltd");
		
	}

}
//driver.findElement(By.xpath("//span[text()='Admin']")).click();