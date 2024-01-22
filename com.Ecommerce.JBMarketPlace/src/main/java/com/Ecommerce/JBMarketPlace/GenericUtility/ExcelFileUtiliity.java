package com.Ecommerce.JBMarketPlace.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class consist of generic method to get data from excel sheet
 * @author debas
 *
 */
public class ExcelFileUtiliity {
	/**
	 * This method help us to get data from excel sheet
	 * @param sheetName
	 * @param row
	 * @param column
	 * @return
	 * @throws Throwable
	 */
	public String getDataFromExcelSheet(String sheetName,int row,int column) throws Throwable {
		FileInputStream fis=new FileInputStream(IpathConstatnt.Excelfilepath);
		String value = WorkbookFactory.create(fis).getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		return value;
	}

}
