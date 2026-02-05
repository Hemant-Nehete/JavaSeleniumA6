package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichingControlToANewTabNewWindow {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cococart.in/");
	// to open anew tab
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.chocoliz.com/");
	// to open anew window
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://royceindia.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.fabelle.in/");
}
}
