package testngExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassExample {
	
	static WebDriver driver;

		 
	@BeforeSuite
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	}
	@BeforeTest
	public void browserlaunch()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void urlbrowser()
	{
	driver.get("https://the-internet.herokuapp.com/");
	}
	@BeforeMethod
	public void login()
	{
	driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
	}
	
	@AfterMethod
	public void signOut()
	{
		System.out.println("sign out off the application");
		driver.findElement(By.xpath("//i[contains(text(),'Logout')]")).click();
		
	}
	@AfterClass
	public void deletecookies()
	{
	driver.manage().deleteAllCookies();
	}
	@AfterTest
	public void browerClose()
	{
	driver.close();
	}
	@AfterSuite
	public void closeAllbrowser()
	{
	driver.quit();
	}
}






