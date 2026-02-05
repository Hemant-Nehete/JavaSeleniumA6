package org.generic.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * The class Flib mainly used to interact with file and fetch the Test Data needed for Automating The Application
 * 
 * @author Hemant Nehete
 */
public class Flib {
	

	/**
	 * This method accepts the key and it will fetch the value of the respective key in the given properties file 
	 * @param key [String]
	 * @return value[String]
	 */
     public static String getPropertyValue(String propPath, String key)
     {
    	 File file = new File(propPath);
    	 FileInputStream fis = null;
    	try
    	{
    		fis=new FileInputStream(file);
    	}
    	catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	 Properties prop = new Properties();
    	 try {
    		 prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	 
    	String value= prop.getProperty(key);
    	 return value;
     }
     
     
    /**
     * This method accepts sheetName , rowIndex , cellIndex and it will fetch the value of the respective cell
     * @param sheetName [String]
     * @param rowIndex [int]
     * @param cellIndex [int]
     * @return value [String]
     */
     
     public static String getWorkbookCellValue(String excelPath, String sheetName, int rowIndex, int cellIndex)
     {
    	 File file = new File(excelPath);
    	 FileInputStream fis = null;
    	 Workbook wb =null;
    	 try {
    	 fis= new FileInputStream(file);
    	 wb= WorkbookFactory.create(fis);
    	 }
    	 catch(FileNotFoundException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 catch(IOException e)
    	 {
    		e.printStackTrace(); 
    	 }
    	 catch(EncryptedDocumentException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
    	 String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
    	 return value;
     }
     
     public static String getNumericCellValueMethod(String excelPath, String sheetName , int rowNo, int cellNo) throws EncryptedDocumentException, IOException
     {
    	 FileInputStream fis = new FileInputStream(excelPath);
    	 Workbook wb = WorkbookFactory.create(fis);
    	Sheet sheet = wb.getSheet(sheetName);
    	Row row = sheet.getRow(rowNo);
    	Cell cell = row.getCell(cellNo);
    	double data = cell.getNumericCellValue();
    	
    	int data1 = (int)data;
    	String value = String.valueOf(data1);
    	return value;
    }
     
     public static int generateRandomNO()
     {
    	 Random random = new Random();
    	 int  rn = random.nextInt(1000,9999);
		 return rn;
    	 
     }
}
