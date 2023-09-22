package in.debasish.datadrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws IOException {


		FileOutputStream file=new FileOutputStream("C:\\Users\\Debasish\\eclipse-workspace\\SeleniumTesting\\testData\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		XSSFRow row1=sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Debasish");
		row1.createCell(1).setCellValue("Shibasish");
		row1.createCell(2).setCellValue("Kubhasish");
		
		XSSFRow row2=sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Pruseth");
		row2.createCell(1).setCellValue("seth");
		row2.createCell(2).setCellValue("Patel");
		
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<=3;r++) {
			
			XSSFRow currentRow=sheet.createRow(r);
			
			for(int c=0;c<=2;c++) {
				
				System.out.println("Enter a value:");
				String value=sc.next();
				currentRow.createCell(c).setCellValue(value);
				
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Excel operation is completed");

	}

}
