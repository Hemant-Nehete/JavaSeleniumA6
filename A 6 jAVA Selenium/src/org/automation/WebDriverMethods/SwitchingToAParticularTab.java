package org.automation.WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToAParticularTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expectedURL = "https://www.rolex.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/en-in/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://jokerandwitch.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.rolex.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://shop.timexindia.com/");
        //------------------------------------------
        // capturing window id or handle of all tabs
        Set<String> allWindowsUrl = driver.getWindowHandles();
        for (String windowId : allWindowsUrl) 
        {
        	driver.switchTo().window(windowId);
        	Thread.sleep(2000);
			String actualUrl = driver.getCurrentUrl();
			// condition to break loop and to stop switching
			if (expectedURL.equals(actualUrl)) 
			{
				break;
				
			}
		}
	}

}
