package seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestleafExample extends Baseclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		startDriver("chrome");
		get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		WebElement dropclick =locator("xpath","//h5[text()='Drop down']");
	
	Actclick(driver,dropclick);
	
	WebElement values =locator("id","dropdown1");
	downSelect(values);
	
	implicitWait(driver,30);
	
	//goback
	
	backmethod();
	
	WebElement mouseove= locator("xpath","//img[@alt='mouseover']");
	
	//clickmethod
	
	Actclick(driver,mouseove);
	
	WebElement ele1=locator("xpath","//a[text()='TestLeaf Courses']");
	
	Actclick(driver,ele1);
	backmethod();
	backmethod();
	
    WebElement frm= locator("xpath","//img[@alt='Frame']");
	
    Actclick(driver,frm);
    
    //frame method
	
	framemove(0);
    
    WebElement firstframe=locator("id","Click");
	
	Actclick(driver,firstframe);
		
	
	}

}
