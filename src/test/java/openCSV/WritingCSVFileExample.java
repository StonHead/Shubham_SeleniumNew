package openCSV;

import java.io.FileWriter;
 
import au.com.bytecode.opencsv.CSVWriter;
 
public class WritingCSVFileExample
{
   public static void main(String[] args) throws Exception
   {
      String csv = "./testData/TestData.csv";
      
      
      
      CSVWriter writer = new CSVWriter(new FileWriter(csv));
        
      //Create record
      String [] record = "114,Kholi,Virat,India,34".split(",");
      //Write the record to file
      writer.writeNext(record);
        
      //close the writer
      writer.close();
   }
}