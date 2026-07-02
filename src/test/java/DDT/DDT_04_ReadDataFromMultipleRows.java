package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_04_ReadDataFromMultipleRows {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Cart");
		int count = sh.getLastRowNum();

		for (int i = 1; i <= count; i++) {
			String prodName = sh.getRow(i).getCell(0).getStringCellValue();
			String range = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(prodName + "----------" + range);
		}

	}

}
