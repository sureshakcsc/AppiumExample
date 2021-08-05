package testngExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestngExample extends BaseClassExample{
	
	

	@Test
	public void afterloginverfication()
	{
	String msg = driver.findElement(By.xpath("//div[(contains(text(),'You logged into a secure area'))]"))
			.getText();
	
	Assert.assertEquals(msg.contains("You logged into a secure area!"), true);
	}	
}	