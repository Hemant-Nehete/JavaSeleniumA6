package org.TestPackage;

import org.generic.lib.BaseTest;
import org.pomrepository.BasePage;
import org.pomrepository.CellPhones;
import org.pomrepository.Electronics;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.generic.lib.MyListners.class)
public class TC_AddToCart_001_Test  extends BaseTest{
	@Test
	public void addToCartMethod()
	{
	  BasePage bp = new BasePage(driver);
	  bp.getElectronicsLink().click();
	  
	  Electronics ep = new Electronics(driver);
	  ep.getCellPhoneLink().click();
	  
	  CellPhones cp = new CellPhones(driver);
	  cp.getSmartPhoneAddToCart().click();
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(cp.getProductAddToCartMsg().isDisplayed(), true, "Product is not added to cart!!");
	  sa.assertAll();		  
	}

}
