package seleniumGoogle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver startDriver(String browsertype)
		
	{
		switch(browsertype)
		{
		case "chrome":
		return driver=new ChromeDriver();
		case "firefox":
		return driver=new FirefoxDriver();	
		
	}
		return null;

	}
	
	public static void get(String url)
	{
		driver.get(url);
	}
	
	public static WebElement locator(String locatorValue,String locatorType)
	{
		switch(locatorValue)
		{
		case "id":
			return  driver.findElement(By.id(locatorType));
		case "name":
			return driver.findElement(By.name(locatorType));
		case "xpath":
			return driver.findElement(By.xpath(locatorType));
	}
		return null;
	}	
		
	/*
	 * public static List<WebElement> locator(String locatorValue,String
	 * locatorType,boolean collection) { switch(locatorValue) {
	 * 
	 * case "id": return driver.findElements(By.id(locatorType)); case "name":
	 * return driver.findElements(By.name(locatorType)); case "xpath": return
	 * driver.findElements(By.name(locatorType)); } return null; }
	 */
	  
	  public static void type(WebElement ele,String text)
	  {
		  ele.sendKeys(text);
	  }
	  
	
	  
	  public static void implicitWait(WebDriver driver, int timeOut) 
	  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }		
			
	  public static void downSelect(WebElement dropdown)
	  {
		   Select  dp= new Select(dropdown);
		   dp.selectByIndex(1);
	  }
	  
	  public static void Actclick(WebDriver driver, WebElement ele) {
		  
		

			Actions act = new Actions(driver);
			act.moveToElement(ele).click().build().perform();

		}
	  
	 public static  void backmethod()
	 {
		 driver.navigate().back();
	 }
	  
	  public static void framemove(int i)
	  {
		  driver.switchTo().frame(i);
	  }
	  
}


	