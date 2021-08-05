package seleniumGoogle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		List lt= new ArrayList();
		lt.add("suresh");
		lt.add("abisek");
		lt.add("balu");
		lt.add("markam");
		lt.add("ganguly");
		
		//before sort 
		System.out.println("the Before sorting :" +lt);
	   Collections.sort(lt);
	   
	   //After Sorting
	   
	   System.out.println("The Ascending Order sort is:" + lt);
	   
	   //Descending order 
	   
	   Collections.reverse(lt);
	   
	   System.out.println("The Descending order sort:" + lt);
	   
	   //Descending order 
	   
		/*
		 * List s= new ArrayList(); s.add("Rames"); s.add("kaja"); s.add("Kannan");
		 * s.add("davis"); Collections.reverse(s);
		 * System.out.println("The Descending order sort:" + s);
		 */
	   
	   
	   //Compare two list:
	   
	  /* if(lt.equals(s))
	   {
		   System.out.println(" The two list are equal");
	   }
		   		   else
		   {   
		   System.out.println(" The two list are not equal");
	   }*/
	   }
	   }  
	
    


