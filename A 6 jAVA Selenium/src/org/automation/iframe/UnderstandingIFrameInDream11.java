package org.automation.iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingIFrameInDream11 {
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.dream11.com/fantasy-sports");
	// 1 st method by using index
	//driver.switchTo().frame(0);
	// 2 nd method by using name or id value
	//driver.switchTo().frame("send-sms-iframe");
	WebElement frame = driver.findElement(By.id("send-sms-iframe"));
	// 3 rd  method by using web element ref
	driver.switchTo().frame(frame);
	driver.findElement(By.id("regEmail")).sendKeys("7249895860");
	driver.findElement(By.linkText("GET APP LINK")).click();
	// 4 th method 
	//return back to the main page
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Industry Overview")).click();
}
}
