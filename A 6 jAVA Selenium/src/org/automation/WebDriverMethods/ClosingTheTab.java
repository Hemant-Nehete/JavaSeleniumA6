package org.automation.WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingTheTab
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.suzukimotorcycle.co.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.jawayezdimotorcycles.com/");
		String expectedURL = "https://www.suzukimotorcycle.co.in/";
		Set<String> allWindowsUrl = driver.getWindowHandles(); 
	        for (String windowId : allWindowsUrl) 
	        {
	        	driver.switchTo().window(windowId);
	        	Thread.sleep(2000);
				String actualUrl = driver.getCurrentUrl();
				if (expectedURL.equals(actualUrl)) 
				{
					driver.close();
				}
					
	}
	}

}
