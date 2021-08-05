package seleniumGoogle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement radiobtn=driver.findElement(By.xpath("//table//label[text()='One Way']/preceding-sibling::*"));
//		WebElement radiobtn=driver.findElement(By.xpath("//table//label[text()='Round Trip']/preceding-sibling::*"));
	//Thread.sleep(20000);
	
	WebDriverWait wait = new  WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeSelected(radiobtn));
	Assert.assertTrue((radiobtn.isSelected()));
	
	//from city 
	
	WebElement fromdp= driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']"));
	Thread.sleep(3000);
	 
	fromdp.click();
	 
	 Thread.sleep(3000);
	  
	WebElement fromcity=  driver.findElement(By.xpath("//a[@value='IXG']"));
	
	fromcity.click();
	
	//to city
	
	driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("COK");
	
	Thread.sleep(4000);
	driver.findElement(By.linkText("Kochi (COK)")).click();
	
	
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	
	//Select firstdrop down adult
	
	WebElement adut1=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	
	
	Select ads1=new Select(adut1);
	
	ads1.selectByIndex(3);
	
	//child select class
	
	WebElement childdp=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
	
	Select childsel=new Select(childdp);
	
	childsel.selectByIndex(3);
	
	//infant
	
WebElement infantdp=driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
	
	Select infantsel=new Select(infantdp);
	
	infantsel.selectByIndex(3);
	
	//Search flight
	
	driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
	
	
	}

}
