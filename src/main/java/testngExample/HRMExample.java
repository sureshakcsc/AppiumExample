package testngExample;



	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class HRMExample {
		
		public  WebDriver  driver;
		@Test  
		public  void  login() throws InterruptedException
		{
		
		 
		 
		   WebDriverManager.chromedriver().setup();
		    driver=new  ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers?userId=");
		   WebElement usname=  driver.findElement(By.id("txtUsername"));
		   usname.sendKeys("Admin");
		  WebElement pass= driver.findElement(By.id("txtPassword"));
		  pass.sendKeys("admin123");
		   WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		   loginbtn.click();
		   
		   //user management link selection 
		   
		   WebElement UserMgmtMainmenu=driver.findElement(By.id("menu_admin_UserManagement"));
		   Actions act= new Actions(driver);
		   act.moveToElement(UserMgmtMainmenu);
		   
		   WebElement Uersubmenu =driver.findElement(By.id("menu_admin_viewSystemUsers"));
		   
		   Thread.sleep(5000);
		   Actions actusrsubmenu= new  Actions(driver);
		   actusrsubmenu.moveToElement(Uersubmenu);
		   actusrsubmenu.click();
		   
		   WebElement  Addbtn= driver.findElement(By.id("btnAdd"));
		   Addbtn.click();
		   
		      
		   WebElement userRoleDropDown= driver.findElement(By.xpath("//select[@id='systemUser_userType']"));
		   
		   Select userdp=new Select(userRoleDropDown);
		   userdp.selectByIndex(0);
		   
		   WebElement empname=driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
		   
		   empname.sendKeys("Jadine Jackie");
		   
		   WebElement usermgmtusername=driver.findElement(By.id("systemUser_userName"));
		   
		   usermgmtusername.sendKeys("Sureshselenium");
		   
	       WebElement usermgmtPasword=driver.findElement(By.id("systemUser_password"));
		   
	       usermgmtPasword.sendKeys("softwaretesting");
	       
	     WebElement usermgmtConfirmPasword=driver.findElement(By.id("systemUser_confirmPassword"));
		   
			
			  usermgmtConfirmPasword.sendKeys("softwaretesting");
			/*/ * 
			 * WebElement UsermgmtSave=driver.findElement(By.id("btnSave"));
			 * 
			 * UsermgmtSave.click();
			 */
	     
	     WebElement cancelbtn=driver.findElement(By.id("btnCancel"));
	     
	     cancelbtn.click();
	     //Cheking usersaved 

	
	     
	     Thread.sleep(8000);
	     
	     WebElement jobadmimenu=driver.findElement(By.id("menu_admin_Job"));
	     
	     Actions actjobaminmenu= new Actions(driver);
		   
	     actjobaminmenu.moveToElement(jobadmimenu).build().perform();
		   
	     //jobtitles
	     
	 WebElement jobmenutiles=driver.findElement(By.id("menu_admin_viewJobTitleList"));
	     
	     Actions actjobtiles= new Actions(driver);
		   
	     actjobtiles.moveToElement(jobmenutiles).build().perform();
	     
	     jobmenutiles.click();
	     
	     
	     //job tile add
	     
	     WebElement jobtilesadd=  driver.findElement(By.id("btnAdd"));
	     
	     jobtilesadd.click();
		   
		  WebElement jobtitle= driver.findElement(By.name("jobTitle[jobTitle]"));
		  
		  jobtitle.sendKeys("Jame bond Role");
		  
		//  jobtitle description
		  
		  WebElement jobdescription=driver.findElement(By.id("jobTitle[jobDescription]"));
		  
		  jobdescription.sendKeys("uk Seecret agent");
		  
		  //job cancel
		  
		  WebElement jobCancel= driver.findElement(By.id("btnCancel"));
		  
		  jobCancel.click();
		  
		   
		   
		   

	}
	}	


