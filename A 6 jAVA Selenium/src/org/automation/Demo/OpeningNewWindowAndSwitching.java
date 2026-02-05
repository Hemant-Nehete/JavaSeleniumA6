package org.automation.Demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewWindowAndSwitching {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.yamaha-motor-india.com/");
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.jawayezdimotorcycles.com/");
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.royalenfield.com/in/en/home/");
	    String expectedURL = "https://www.royalenfield.com/in/en/home/";
	     Set<String> allWindowId = driver.getWindowHandles();
	     for (String windowId : allWindowId) {
	    	 driver.switchTo().window(windowId);
	    	 Thread.sleep(3000);
	    	 String currentURL = driver.getCurrentUrl();
	    	 if (expectedURL.equals(currentURL)) {
	    		 driver.close();
				
			}
			
		}
	}
}
