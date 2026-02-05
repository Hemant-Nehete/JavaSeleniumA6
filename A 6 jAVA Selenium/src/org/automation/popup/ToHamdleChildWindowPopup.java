package org.automation.popup;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHamdleChildWindowPopup {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://omayo.blogspot.com/");
		  //String parentWindowid = driver.getWindowHandle();
		  driver.findElement(By.linkText("Open a popup window")).click();
		 Set<String> allWindowId = driver.getWindowHandles();
		 String expectedWindowId = "New Window";
		 for (String wi : allWindowId) {
			driver.switchTo().window(wi);
			if(driver.getTitle().equals(expectedWindowId))
			{
				break;
			}
			
		}
		 driver.close();
	}

}
