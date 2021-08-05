package testngExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationorder {
	
	@BeforeSuite
	public void bethodsuite()
	{
	  System.out.println("This is Before suite method");	
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is Before Test method");
	}
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("This is Before method method");
	}
	@BeforeClass
	public void Beforeclassmethod()
	{
		System.out.println("This is Before class method");
	}
	@Test
	public void FirstTestoneMethod()
	{
		System.out.println("This is first test method");
	}
    @Test   
	public void secondTestoneMethod()
	{
		System.out.println("This is Second  test method");
	}
	
	@AfterSuite
	public void Aftersuitemethod()
	{
	  System.out.println("This is After suite method");	
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("This is After Test method");
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("This is After method");
	}
	@AfterClass
	public void Afterclassmethod()
	{
		System.out.println("This is After class method");
	}
}
