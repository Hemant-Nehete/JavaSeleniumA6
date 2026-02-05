package org.automation.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingAllBrowser {

	public static void main(String[] args) 
	{
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Browser name:");
		String browserName = sc.next();
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
        else if (browserName.equalsIgnoreCase("edge"))
        {
        	driver = new EdgeDriver();
        	
		}
        else
        {
        	System.err.print("Invalid Browser!!!!");
        
        }	
	}

}
