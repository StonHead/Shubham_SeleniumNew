package pdfBoxExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadPDFContent2 {
	
	
	@Test
	public void verifyPDFData() throws Exception {
		
		
		//FileInputStream fis = new FileInputStream("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
//		FileInputStream fis = new FileInputStream("C:\\Users\\Act\\Downloads\\file-sample_150kB.pdf");
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		
		
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		int pdfPageCount = pdfDocument.getPages().getCount();
		
		System.out.println("No. of pages: " + pdfPageCount);
		
		
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		pdfText.setStartPage(2);         //page 2-5
		pdfText.setEndPage(3);
		
		
		
		
		
		String PDF_content_Text = pdfText.getText(pdfDocument);
		
		
		
		
		System.out.println(PDF_content_Text);
		
		
		//validation 
		Assert.assertTrue(PDF_content_Text.contains("As the final interpreter of the Constitution"));			//pass
		
		pdfDocument.close();
		fis.close();
		
	}

}
