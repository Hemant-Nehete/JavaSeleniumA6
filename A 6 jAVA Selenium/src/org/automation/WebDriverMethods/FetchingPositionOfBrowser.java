package org.automation.WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPositionOfBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://store.steampowered.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println("X : "+position.getX());
		System.out.println("Y : "+position.getY());
		
		// new position
		Point targetposition = new Point(-200,300 );
		driver.manage().window().setPosition(targetposition);
		
	}

}
