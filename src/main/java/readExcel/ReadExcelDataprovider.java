package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDataprovider {
	
    @Test
	public Object[][] getexceldata(String filepath, String sheetname) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		
		Workbook wf= new XSSFWorkbook(fis);
		
	    Sheet st= wf.getSheet(sheetname);
	    
	 int noofrows =  st.getPhysicalNumberOfRows();
	 
	 System.out.println(noofrows);
		
	 int noofcols=st.getRow(0).getLastCellNum();
	 
	 System.out.println(noofcols);
	 
	 Object[][] data = new Object[noofrows - 1][noofcols];

	 
	 for(int i=1;i<noofrows;i++)
	 {
		 Row rowvalue =st.getRow(i);
		  
		 for(int j=0;j<noofcols;j++)
		 {
			Cell columnvalue = rowvalue.getCell(j);
			
			switch(columnvalue.getCellType())
			{
				case STRING:
					
			data[i-1][j]=columnvalue.getStringCellValue();
				break;
					
				case NUMERIC:
					
					data[i-1][j]=columnvalue.getNumericCellValue();
					break;
								
			}
			System.out.println("|");	
		 }				
	 }
	return data;
	 
	}

	
}		
		
		
	

