package seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogCopyPaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/advanced_search");
		
		Thread.sleep(3000);
		
		WebElement txtindia=driver.findElement(By.id("xX4UFf"));
		txtindia.sendKeys("Weclome to selenium automation testing");
		
		/*
		 * Actions s = new Actions(driver); Thread.sleep(4000);
		 * s.contextClick(txtindia).build().perform();
		 */
	
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+ "a");
		
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+ "c");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("CwYCWc")).sendKeys(Keys.CONTROL+"v");
		
		
	}

}
