package org.automation.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenShotOfWebpage {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':', '-');
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		//step 1
		TakesScreenshot ts = (TakesScreenshot)driver;
		//step 2
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    //step 3
	    File dest = new File("./Errorshots/sreenshot"+timeStamp+".png");
	    FileHandler.copy(src, dest);
	}

}
