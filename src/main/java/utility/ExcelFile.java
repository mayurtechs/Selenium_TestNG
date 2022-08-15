package utility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class ExcelFile extends Constant{


	public ExcelFile(String filePath, String sheetName) throws IOException
	{
		filePath = "./inputData/testData.xlsx";
		sheetName = "sheet1";
		workbook = new XSSFWorkbook(filePath);
		sheet = workbook.getSheet(sheetName);
	}
	
	public static void getRowCount()
	{
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
	}
	
	public static Object getCellData(int row, int cellnum) throws IOException
	{
		new ExcelFile("./inputData/testData.xlsx", "sheet1");
		DataFormatter dataformatter = new DataFormatter();
		Object values = dataformatter.formatCellValue(sheet.getRow(row).getCell(cellnum));
		System.out.println(values);
		return values;
	}
	
	
}
