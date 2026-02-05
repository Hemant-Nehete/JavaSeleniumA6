package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SitchingToParentTab {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/en-in/");
		// capturing the window id or handle of parent or main tab
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://jokerandwitch.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.rolex.com/");
        // switching to parent tab using the parent tab window id
        driver.switchTo().window(parentWindowId);
	}

}
