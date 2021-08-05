package seleniumGoogle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleExample extends Baseclass{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
//	System.setProperty("webdriver.chrome.driver", "E:\\Selenium sathish\\Traning-April2\\chromedriver.exe");
		
	WebDriverManager.chromedriver().setup();	
	
	startDriver("chrome");

//    WebDriver driver = new ChromeDriver();
	
	get("http://www.google.com");
    
  //  driver.get("http://www.google.com/");
 //   driver.manage().window().setSize(new Dimension(500,500));
    
   // System.out.println(width);
    Thread.sleep(5000);  // Let the user actually see something!
  //  WebElement searchBox = driver.findElement(By.name("q"));
    WebElement searchBox=locator("name","q");
  //  searchBox.sendKeys("selenium");
    
    type(searchBox,"selenium");
    
  //  locator("xpath","//ul[@role='listbox']//li/descendant::div[@class='sbl1']",true);
    
   List<WebElement> lt=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
   
   int totalsize=lt.size();
   
   Thread.sleep(5000);
   for(int i=0;i<totalsize;i++)
   {
	 String autotext= lt.get(i).getText();
	 if(autotext.equals("selenium tutorial"))
	 {
		    lt.get(i).click();
		   break;
	 }
	   
   }
    
    
    

}
}