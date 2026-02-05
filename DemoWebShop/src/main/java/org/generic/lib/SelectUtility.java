package org.generic.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	public void selectByVisibleTextMethod(WebElement dropdownElement , String visibleText)
	{
		Select sel = new Select(dropdownElement);
		sel.selectByVisibleText(visibleText);
	}

}
