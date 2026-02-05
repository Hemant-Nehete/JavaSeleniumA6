package org.automation.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsParallel4 {
	public static void main(String[] args) {
		

	        // Main Window
	        WebDriver driver1 = new ChromeDriver();
	        driver1.manage().window().setSize(new Dimension(800, 500));
	        driver1.manage().window().setPosition(new Point(-8, 0));
	        driver1.get("https://www.google.com");

	        // 2nd Window
	        WebDriver driver2 = driver1.switchTo().newWindow(WindowType.WINDOW);
	        driver2.manage().window().setSize(new Dimension(800, 500));
	        driver2.manage().window().setPosition(new Point(820, -8));
	        driver2.get("https://www.bing.com");

	        // 3rd Window
	        WebDriver driver3 = driver1.switchTo().newWindow(WindowType.WINDOW);
	        driver3.manage().window().setSize(new Dimension(800, 500));
	        driver3.manage().window().setPosition(new Point(0, 520));
	        driver3.get("https://www.yahoo.com");

	        // 4th Window
	        WebDriver driver4 = driver1.switchTo().newWindow(WindowType.WINDOW);
	        driver4.manage().window().setSize(new Dimension(800, 500));
	        driver4.manage().window().setPosition(new Point(820, 520));
	        driver4.get("https://www.duckduckgo.com");

			
		
	}

}
