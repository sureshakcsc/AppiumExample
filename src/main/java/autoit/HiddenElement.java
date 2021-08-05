package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.findElement(By.id("hide-textbox")).click();
	//	driver.findElement(By.id("displayed-text")).sendKeys("Suresh");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementby.id"
	}

}
