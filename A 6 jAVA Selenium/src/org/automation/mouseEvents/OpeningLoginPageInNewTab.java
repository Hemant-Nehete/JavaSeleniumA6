package org.automation.mouseEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningLoginPageInNewTab {

	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
       
	}

}
