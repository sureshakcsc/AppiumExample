package autoit;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		Iterator it= allwindows.iterator();
		
		Object Parentwndowid=it.next();
		
		System.out.println(Parentwndowid);
		
		String Childtwndowid=(String) it.next();
		System.out.println(Childtwndowid);
		
		driver.switchTo().window(Childtwndowid);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("session[username_or_email]")).sendKeys("suresh");
		
		
		
	}

}
