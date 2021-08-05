package autoit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https:/amazon.com");
	    List<WebElement> lt=driver.findElements(By.tagName("a"));
	  	System.out.println(lt.size());
		
		for(WebElement e: lt)
		{
			String alllinks=e.getAttribute("href");
			System.out.println(alllinks);
		//	lt.add(all);
			lt.add(alllinks);
			URL ur=new URL(alllinks);
		HttpURLConnection conn=	(HttpURLConnection) ur.openConnection();
		conn.connect();
	    if(conn.getResponseCode()>=400)
	    {
	    	System.out.println(alllinks + "------->" + conn.getResponseMessage()+"broken links");
	    }
	    	else
	    	{
	    		System.out.println(alllinks + "------->" +conn.getResponseMessage()+"valid links");
	    }
			
		}
	}
	}



