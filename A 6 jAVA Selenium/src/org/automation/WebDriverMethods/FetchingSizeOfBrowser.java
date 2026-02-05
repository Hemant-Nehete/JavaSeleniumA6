package org.automation.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSizeOfBrowser 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://shariefbhai.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Height : "+size.getHeight());
		System.out.println("width :"+size.getWidth());
		driver.manage().window().maximize();
		Dimension size1 = driver.manage().window().getSize();
		System.out.println(size1);
		System.out.println("Height : "+size1.getHeight());
		System.out.println("width :"+size1.getWidth());
		
		// new size
		Dimension targetsize = new Dimension(650,650 );
		driver.manage().window().setSize(targetsize);
		
	}

}
