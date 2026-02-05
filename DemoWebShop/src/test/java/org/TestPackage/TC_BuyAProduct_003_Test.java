package org.TestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.generic.lib.BaseTest;
import org.generic.lib.Flib;
import org.pomrepository.BasePage;
import org.pomrepository.CellPhones;
import org.pomrepository.CheckOutPage;
import org.pomrepository.Electronics;
import org.pomrepository.ShoppingCartPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.generic.lib.MyListners.class)
public class TC_BuyAProduct_003_Test  extends BaseTest{
    @Test
    public void buyingProduct() throws EncryptedDocumentException, IOException
    {
    	BasePage bp = new BasePage(driver);
		  bp.getElectronicsLink().click();
		  
		  Electronics ep = new Electronics(driver);
		  ep.getCellPhoneLink().click();
		  
		  CellPhones cp = new CellPhones(driver);
		  cp.getSmartPhoneAddToCart().click();
		  
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(cp.getProductAddToCartMsg().isDisplayed(), true, "Product is not added to cart!!");
		  
		  
		  bp.getShoppingCartLink().click();
		  
		  ShoppingCartPage scp = new ShoppingCartPage(driver);
		  scp.getSmaertPhoneCartItem().click();
		  scp.getAgrreChekBox().click();
		  scp.getCheckoutButton().click();
		  
		  String city = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"Providing Adress ", 1, 0);
		  String address1 = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"Providing Adress ", 1, 1);
		  String pincode = Flib.getNumericCellValueMethod( EXCEL_PATH_TEST,"Providing Adress ",1, 2);
		  String phone = Flib.getNumericCellValueMethod(EXCEL_PATH_TEST,"Providing Adress ", 1, 3);
		  
		  
		  CheckOutPage cpp = new CheckOutPage(driver);
		  cpp.buyingSmartPhone(city, address1, pincode, phone);
		  
		  
		  
		  
    }
}
