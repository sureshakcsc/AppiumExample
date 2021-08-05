package seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	    
	    driver.switchTo().frame("packageListFrame");
	    
	    driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		
	}

}
