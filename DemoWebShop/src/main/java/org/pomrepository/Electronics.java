package org.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {
	@FindBy(partialLinkText = "Cell phones") private WebElement cellPhoneLink;
	@FindBy(partialLinkText = "Camera, photo") private WebElement camera,PhotoLink;
	
	public Electronics(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}

	public WebElement getCamera() {
		return camera;
	}

	public WebElement getPhotoLink() {
		return PhotoLink;
	}

}
