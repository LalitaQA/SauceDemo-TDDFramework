package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String toReadDataFromExcel(String sheetname, int rowno, int cellno) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return data;
	}
	
	public int getLastRowNo(String sheetname) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet(sheetname).getLastRowNum();
		return count;
	
	}

}
