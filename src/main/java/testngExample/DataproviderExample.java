package testngExample;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readExcel.ReadExcelDataprovider;

public class DataproviderExample {
	
	
	/*
	 * @Test(dataProvider = "getData") public void addition(double a, double b,
	 * double c) { double num3 = a + b; Assert.assertEquals(num3, c); }
	 */
	 
	
	/*
	 * @Test(dataProvider = "getData") public void addition(HashMap<String, Double>
	 * map) {
	 * 
	 * Double c = map.get("num1") + map.get("num2");
	 * Assert.assertEquals(map.get("result"), c);
	 
	}*/

	  @Test(dataProvider = "getData")
	public Object[][] getData() throws IOException {
		 return new
				 ReadExcelDataprovider().getexceldata("E:\\ExcelRead.xlsx","data");
	//	 GetExcelData().getExcelData("/Users/sathishkumarramalingam/Desktop/TestData.xlsx",
		// "data");

		/*
		 * HashMap<String, Double> map = new HashMap<>();
		 * 
		 * map.put("num1", 1.0); map.put("num2", 2.0); map.put("result", 3.0);
		 * 
		 * HashMap<String, Double> map1 = new HashMap<>();
		 * 
		 * map1.put("num1", 5.0); map1.put("num2", 7.0); map1.put("result", 12.0);
		 * 
		 * 
		 * //return new Object[][] { { map }, { map1 } }; return new Object[][] { { map
		 * }, { map1 } };
		 */
	}

}



