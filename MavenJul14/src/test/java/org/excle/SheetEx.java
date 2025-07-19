package org.excle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetEx {
	
	public static void main(String[] args) throws IOException {
		
		.args.File f=new File("C:\\Users\\muthu\\Downloads\\Book2.xlsx");
		
		FileInputStream s=new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(s);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		
	}

}
