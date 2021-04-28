package DataPrividerDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadXlsxFile {
	@Test(dataProvider = "StudentInformation")
	public void StudetntInfo(String name, String pass) {
		System.out.println(name + "       " + pass);
	}
	@DataProvider(name = "StudentInformation")
	public Object[][] StudentData() throws IOException {
		Object[][] value = null;
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium\\inputfiles\\FormNo.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("StudRollNo");

		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();

		value = new Object[row][col];
		for (int i = 0; i < row; i++) {
			Row rows = sheet.getRow(i);
			int cols = rows.getLastCellNum();

			for (int j = 0; j < cols; j++) {
				Cell cell = rows.getCell(j);
				DataFormatter fr = new DataFormatter();
				value[i][j] = fr.formatCellValue(cell);

			}
		}
		return value;
	}

}