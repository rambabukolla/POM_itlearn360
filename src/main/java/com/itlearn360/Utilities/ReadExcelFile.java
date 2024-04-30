package com.itlearn360.Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static FileInputStream inputStream;
	public static XSSFWorkbook workBook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo) {
		
		try {
				inputStream = new FileInputStream(fileName);
				workBook = new XSSFWorkbook(inputStream);
				excelSheet = workBook.getSheet(sheetName);
				cell = workBook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
			
				workBook.close();
				
				return cell.getStringCellValue();
				
		}catch(Exception e) {
		
		return "";
		}
	}
	
	public static int getRowCount(String fileName, String sheetName) {
		
		try {
		inputStream = new FileInputStream(fileName);
		workBook = new XSSFWorkbook(inputStream);
		excelSheet = workBook.getSheet(sheetName);
		
		int ttlrows = excelSheet.getLastRowNum() + 1;
		return ttlrows;
		}catch(Exception e) {
			
			return 0;
		}
	}
	
	public static int getCellCount(String fileName, String sheetName) {
	
		try {
		inputStream = new FileInputStream(fileName);
		workBook = new XSSFWorkbook(sheetName);
		excelSheet = workBook.getSheet(null);
		
		int ttlcells = excelSheet.getRow(0).getLastCellNum();
			
			workBook.close();
	
			return ttlcells;
		}catch(Exception e) {
			
			return 0;
		}
	}
	
	public String getStringData(int SheetIndex, int row, int column) {
		
		return workBook.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int row, int column) {
		
		return workBook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int column) {
		
		return workBook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}
