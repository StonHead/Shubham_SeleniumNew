package readExcelExample;

import java.io.FileInputStream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//workbook.getSheetAt(0);			//indexing strat from 0
		
		XSSFSheet sheet = workbook.getSheet("smokeTest");			//smokeTest
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
