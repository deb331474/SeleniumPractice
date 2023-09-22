package in.debasish.datadrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {

		//InputStream fis = new FileInputStream(
				//System.getProperty("C:\\Users\\Debasish\\eclipse-workspace\\SeleniumTesting\\testData\\data.xlsx"));

		/*
		 * String oneDriveExcelLink =
		 * "https://1drv.ms/x/s!AqxBcq9tXjtggak5-fqlclL56R-HBQ?e=TVsyjH";
		 * 
		 * URL url = new URL(oneDriveExcelLink); InputStream fis = url.openStream();
		 */
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
 
		int totalRows = sheet.getLastRowNum();

		int totalColumns = sheet.getRow(0).getLastCellNum();

		System.out.println("Total no of Rows " + totalRows);

		System.out.println("Total no of Columns " + totalColumns);
		
		for(int r=0;r<totalRows;r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<totalColumns;c++) {
				String value=currentRow.getCell(c).toString();
				System.out.println("Current value is:" +value);
			}
			
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}
