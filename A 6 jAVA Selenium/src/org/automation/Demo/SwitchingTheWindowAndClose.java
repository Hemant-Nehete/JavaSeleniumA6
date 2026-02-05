package org.automation.Demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTheWindowAndClose {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("file:///C:/Users/Hemant%20Nehete/Downloads/Assign.html");
		 driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		 String swiggy = "https://www.swiggy.com/";
		Set<String> allWindowId = driver.getWindowHandles();
		for (String currentWindowID : allWindowId) {
		   driver.switchTo().window(currentWindowID);
		   Thread.sleep(3000);
		   String cuurentURL = driver.getCurrentUrl();
		    if (cuurentURL.equalsIgnoreCase(swiggy)) {
		    	
		    
				driver.manage().window().maximize();
			}
		    
		
		
			
		}
	}

}
