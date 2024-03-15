package openCSV;

import java.io.FileReader;
import java.util.Arrays;
 
import au.com.bytecode.opencsv.CSVReader;
 
public class ParseCSVLineByLine
{
   @SuppressWarnings("resource")
   public static void main(String[] args) throws Exception
   {
      //Build reader instance
      //Read data.csv
      //Default seperator is comma
      //Default quote character is double quote
      //Start reading from line number 2 (line numbers start from zero)
	   
	   
	   
      CSVReader reader = new CSVReader(new FileReader("./testData/TestData.csv"), ',' , '"' , 1);
       
      //Read CSV line by line and use the string array as you want
      String[] nextLine;
      
      
      while ((nextLine = reader.readNext()) != null) {
         if (nextLine != null) {
            //Verifying the read data here
            System.out.println(Arrays.toString(nextLine));
         }
       }
   }
}