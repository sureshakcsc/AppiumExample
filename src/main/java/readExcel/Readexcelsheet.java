package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String excelpath="E:\\ExcelRead.xlsx";
		FileInputStream fis=new FileInputStream(excelpath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheetAt(0);
		
	//	System.out.println("The Row value "+ row.getFirstCellNum());
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("The Number of Rows:" +rowcount);
		
	  int colcount=sheet.getRow(1).getLastCellNum();
	  System.out.println("The number of Colcount:" +colcount );
	  
	  for(int i=0;i<=rowcount;i++)
	  {
		 XSSFRow rowvalue= sheet.getRow(i);
		 {
			 for(int j=0;j<colcount;j++)
			 {
				XSSFCell colvalue= rowvalue.getCell(j);
				
				switch(colvalue.getCellType())
				{
				case STRING:System.out.print(colvalue.getStringCellValue());break;
				case NUMERIC:System.out.print(colvalue.getNumericCellValue());break;
				}
				System.out.print(" | ");
			 }
		 }
	  }
	  System.out.println();
	}

}

		
		
				
				