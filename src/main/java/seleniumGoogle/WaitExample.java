package seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		 
		
			/*
			 * Function f = new Function() { public void f1() { System.out.println("test");
			 * } }
			 */
		

		WebElement ele = null;
		try {
			ele = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		} catch (Exception e) {
			System.out.println("Element not found");
		}

		try {
			System.out.println(ele.getText());
		} catch (Exception e) {
			System.out.println("Text not found");
		}

		driver.close();

	}

}
