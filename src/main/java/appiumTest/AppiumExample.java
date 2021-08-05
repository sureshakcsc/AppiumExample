package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class AppiumExample {

	public static AppiumDriver driver;
	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		
		
	//	public AndroidWebDriver<WebElement> driver;
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "10.0");
		desiredCapabilities.setCapability("deviceName", "Realme 6");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "E:\\Appium installation\\Calculator.apk" );
		desiredCapabilities.setCapability("appPackage","com.google.android.calculator");
		desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		   driver = new AndroidDriver(url, desiredCapabilities);
	//	driver = new AndroidWebDriver<WebElement>(url, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
	WebElement digiteight=driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
	
	
	digiteight.click();
	
	Thread.sleep(3000);
	
	
WebElement plus=driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	
	
	plus.click();
	
	
WebElement digitthree=driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
	
	
	digitthree.click();
	
	//com.google.android.calculator:id/pad_basic
	
WebElement resultequal=driver.findElement(By.id("com.google.android.calculator:id/eq"));
	
	
resultequal.click();
	
	


		 	}

}
