package seleniumGoogle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(4000);
	    
	    //Entering the First Textbox
	    
	   WebElement firsttextbox=driver.findElement(By.xpath("//div[@id='divA']//input"));
	    
	   firsttextbox.sendKeys("Suresh");
	    
	   //Entering the secondText box value   
	   	    
      WebElement Secondtextbox=driver.findElement(By.xpath("//div[@id='divB']//input"));
	    
       Secondtextbox.sendKeys("Ramesh");
       
     //Entering the ThirdText box value   
   
   WebElement thirtextbox=driver.findElement(By.xpath("//div[@id='divC']//input"));
   
   thirtextbox.sendKeys("Sathish");
   Thread.sleep(4000);
   
    //Click on the  Google link 
   
	WebElement googleclick=driver.findElement(By.xpath("//span[text()='google link']"));
	
	googleclick.click();    
	
	//Enter Text in Google Page 
	
	driver.findElement(By.name("q")).sendKeys("Jamesbond");
	
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	//Retnering Test sathish kumar ramalingam
	
	 WebElement thirtextboxback=driver.findElement(By.xpath("//div[@id='divC']//input"));
	   
	 thirtextboxback.clear();
	 
     thirtextboxback.sendKeys("satish kumar ramalingam");
	
	
	}

}
