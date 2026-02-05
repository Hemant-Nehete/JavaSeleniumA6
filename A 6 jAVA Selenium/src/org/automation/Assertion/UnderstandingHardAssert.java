package org.automation.Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class UnderstandingHardAssert {
	public void validLogin()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	String expectedWelcomePage = "Demo Web Shop ";
	String expectedLoginPage = "Demo Web Shop. Login";
	
	Assert.assertEquals(driver.getTitle(), expectedWelcomePage, "Welcome page should be not displayed!!");
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(driver.getTitle(), expectedLoginPage,"Login Page should not displayed!!");
	driver.findElement(By.id("Email")).sendKeys("nehetehemant2004@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Hemant@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.quit();
	}

}
