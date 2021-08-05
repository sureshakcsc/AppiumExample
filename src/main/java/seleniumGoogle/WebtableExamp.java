package seleniumGoogle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableExamp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://money.rediff.com/gainers");
	    
	    Thread.sleep(4000);	
	    
	   
	//List<WebElement> Firstrowcolumlun= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[i]//td[j]"));
	
	    List<WebElement> Firstrowcolumlun= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr/td[2]"));
	 for(int i=1;i<Firstrowcolumlun.size();i++)
	    {
	    	
	        /*for(int j=1;j<=4;j++)
	        {
	        	Thread.sleep(5000);*/
	
	System.out.println(Firstrowcolumlun.get(i).getText());
		
	}
	    }
	}

