package readExcelExample;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls");
		
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		//workbook.getSheetAt(0);			//indexing strat from 0
		
		HSSFSheet sheet = workbook.getSheet("smokeTest");			//smokeTest
//		XSSFSheet sheet = workbook.getSheet("Student");				//smokeTest
		
		int RowCount = sheet.getLastRowNum();
		
		
		int ColumnsCount = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("row count: " + RowCount);
		System.out.println("Columns count: " + ColumnsCount);
		
		
		
		for (int i = 1; i <= RowCount; i++) {
			
			
			String name = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			
			
			System.out.println("name and address details are: " +name + " : "+ address);
			
			System.out.println("---------------------------------");
			
		}
		
		
		

	}

}
