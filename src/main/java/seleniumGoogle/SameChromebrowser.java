package seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SameChromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.setExperimentalOption("debuggerAddress","localhost:9333");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://wwww.freecrmpro.com");
	 //   WebElement name=	driver.findElement(By.name("q"));
	  //  name.sendKeys("suresh");
	    
		
		
	}

}
