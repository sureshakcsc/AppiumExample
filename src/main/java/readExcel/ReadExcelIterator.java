package readExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIterator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String excelpath="E:\\ExcelRead.xlsx";
		FileInputStream fis=new FileInputStream(excelpath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheetAt(0);
		
		Iterator rowit=sheet.iterator();
		
		while(rowit.hasNext())
		{
			XSSFRow rowvalue =(XSSFRow) rowit.next();
			
			Iterator colit=rowvalue.cellIterator();
			
			while(colit.hasNext())
					{
			XSSFCell colvalues=(XSSFCell) colit.next();
			switch(colvalues.getCellType())
			{
			case STRING:System.out.print(colvalues.getStringCellValue());break;
			case NUMERIC:System.out.print(colvalues.getNumericCellValue());break;
			}
			System.out.print(" | ");
		 }
	 }
  
  System.out.println();
}
					
		}
		

	


