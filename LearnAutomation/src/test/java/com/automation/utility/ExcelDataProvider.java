package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() {
		
		try {
			File src=new File("./TestData/Data.xlsx");
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("unable to read excel file"+e.getMessage());
		}
	}
	//Method Overloading
	public String getStringData(int sheetIndex,int rows,int columns) {
		return wb.getSheetAt(sheetIndex).getRow(rows).getCell(columns).getStringCellValue();
	}
	public String getStringData(String sheetName, int rows, int columns) {
		return wb.getSheet(sheetName).getRow(rows).getCell(columns).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int rows, int columns) {
		return wb.getSheet(sheetName).getRow(rows).getCell(columns).getNumericCellValue();
	}
}
