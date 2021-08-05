package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDempoApi {
	
	//public static AppiumDriver driver;
	public static AndroidDriver driver;
	 

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "10.0");
		desiredCapabilities.setCapability("deviceName", "Realme 6");
    //	desiredCapabilities.setCapability(MobileCapabilityType.APP, "E:\\Appium installation\\ApiDemos-debug.apk" );
	//	desiredCapabilities.setCapability("appPackage","in.amazon.mShop.android.shopping");
	//	desiredCapabilities.setCapability("appActivity","com.amazon.mShop.navigation.MainActivity");
		
		desiredCapabilities.setCapability("appPackage","io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");


		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		   driver = new AndroidDriver(url, desiredCapabilities);
	//	driver = new AndroidWebDriver<WebElement>(url, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
	//	driver.findElementsById("android:id/text1").get(0);
		
	List<WebElement> viewlink=	driver.findElements(By.id("android:id/text1"));
	
	
	  for(int i=0;i<viewlink.size();i++)
	  {
	String  viewtext = viewlink.get(i).getText();
	System.out.println(viewtext);
	
	   if(viewtext.equals("Views"))
	  {
	  viewlink.get(i).click();
	  List<WebElement> controls= driver.findElements(By.id("android:id/text1"));
	    controls.get(4).click();
	//   break; 
	  /* }
	  }*/
	 
	  Thread.sleep(3000);
	  
	 // List<WebElement> controls;
		/*
		 * try { controls = driver.findElements(By.id("android:id/text1")); } catch
		 * (StaleElementReferenceException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * for(int j=0;j<controls.size();j++) { String controlstext =
		 * viewlink.get(j).getText(); System.out.println(controlstext);
		 * 
		 * if(controlstext.equals("Controls")) { viewlink.get(j).click(); break; } }
		 */
	  
		
	}
	  }
}
}