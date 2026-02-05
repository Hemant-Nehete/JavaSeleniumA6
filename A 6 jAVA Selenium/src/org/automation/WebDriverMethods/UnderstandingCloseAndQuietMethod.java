package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingCloseAndQuietMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.purplle.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
