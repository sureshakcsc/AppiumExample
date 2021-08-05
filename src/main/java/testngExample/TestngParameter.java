package testngExample;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameter {
	
//	@Parameters({"a1","b1","c1"})
	//@Test(groups= {"smoke"})
	@Test
	public void firstprogram()
	{
		System.out.println(" First program is executed");
		
	//	System.out.println("The integer values are :"+ a +b +c);
	}
	
	
	  @Test(dependsOnMethods="firstprogram") 
	  public void secondprogram() {
	  System.out.println("Second Program is Executed"); }
	 

}
