package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		
	String TestDatafile=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";	
	FileInputStream file=new FileInputStream(TestDatafile);
	wb=new XSSFWorkbook(file);
	
	}
	
	public String getStringTestData_Excel(String Sheetname,int row,int cell) {
		
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
}
