package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Amazonapp {
	
	public static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "10.0");
		desiredCapabilities.setCapability("deviceName", "Realme 6");
    //	desiredCapabilities.setCapability(MobileCapabilityType.APP, "E:\\Selenium sathish\\appium learn\\Amazon.apk" );
	//	desiredCapabilities.setCapability("appPackage","in.amazon.mShop.android.shopping");
	//	desiredCapabilities.setCapability("appActivity","com.amazon.mShop.navigation.MainActivity");
		
		desiredCapabilities.setCapability("appPackage","com.flipkart.android");
		desiredCapabilities.setCapability("appActivity","com.flipkart.android.SplashActivity");


		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		   driver = new AndroidDriver(url, desiredCapabilities);
	//	driver = new AndroidWebDriver<WebElement>(url, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);

	}

}
