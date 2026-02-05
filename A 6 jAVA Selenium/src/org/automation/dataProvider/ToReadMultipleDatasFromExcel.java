package org.automation.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatasFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
         Sheet sheet = wb.getSheet("invalidcreds");
         int rowCount = sheet.getPhysicalNumberOfRows()-1;
         int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
         
         String[][] data = new String [rowCount] [cellCount];
         
	}

}
