package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheWindowID
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		String WindowID = driver.getWindowHandle();
		System.out.println(WindowID);
				
		
	}

}
