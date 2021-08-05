package seleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicwebtableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://demo.opencart.com/admin/index.php?");
	    
	    Thread.sleep(4000);
	    
	WebElement us=  driver.findElement(By.xpath("//input[@name='username']"));
	us.clear();
	 Thread.sleep(3000);
	us.sendKeys("sureshakcsc");
	
	WebElement pw= driver.findElement(By.xpath("//input[@name='password']"));
	us.sendKeys("demo");
	    
	//button[@type='submit']
	
	WebElement submit= driver.findElement(By.xpath("//button[@type='submit']"));
	
	submit.click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

	WebElement  getpage=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']"));

	String Pageall=getpage.getText();
	
	System.out.println(Pageall);
	
	//Get pagenumber alone using extraction 
	
	
	
String Finalpagenumstr=(Pageall.substring(25,28));

 
 
 int Pagenumber = Integer.valueOf(Finalpagenumstr);
 
 System.out.println(Pagenumber);
 
 for(int i=1;i<=3;i++)
 {
	 WebElement Activepage= driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
	 System.out.println("The Total Active page:"+Activepage.getText());
	 Activepage.click();
 int totalrowsize= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
     System.out.println(totalrowsize);
     
  String Pagenum= Integer.toString(i+1);
  
  Thread.sleep(3000);
     
     driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+Pagenum+"']")).click();
	 
	 
 }
	
	
	
}
}