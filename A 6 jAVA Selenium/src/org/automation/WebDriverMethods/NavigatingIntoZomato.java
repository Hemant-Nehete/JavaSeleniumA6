package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingIntoZomato {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://zomato.com/");
		System.out.println("Zomato");
		

	}

}
