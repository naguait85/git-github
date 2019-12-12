package com.greenrope.genericlib;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Sushma
 * 
 */
public class FileLib {
String ppath = "./Testdata//commonData.properties";
String epath = "./Testscript//TestScripts.xlsx";
/**
 * get the properties file key value based on your
 * @param key
 * @return
 * @throws Throwable
 */

 public String getpropertyFileData(String key) throws Throwable {
	FileInputStream fis = new FileInputStream(ppath);
	Properties pobj = new Properties();
	pobj.load(fis);
	String data = pobj.getProperty(key);
	return data;
}
 /**
  * Its used to read the data from excel sheet based on your arguments
  * @param SheetName,rowNum,CelNum
  * @return
  * @throws throwable
  */

public String getExcelData(String SheetName , int rowNum , int cellNum) throws Throwable {
		FileInputStream fis1 = new FileInputStream(epath);
		Workbook wrb = WorkbookFactory.create(fis1);
		Sheet sh = wrb.getSheet(SheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(cellNum);
		String data = cel.getStringCellValue();
		return data;

}
public static void main(String[] args) throws Throwable {
	FileLib f = new FileLib();
	String Browser = f.getpropertyFileData("browser");
	System.out.println(Browser);
	
}
}
