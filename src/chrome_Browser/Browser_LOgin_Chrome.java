package chrome_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_LOgin_Chrome 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 String url = " https://www.google.com/";
	      driver.get(url);
	      
	     System.out.println(driver.getCurrentUrl());
	     
	     String expected_url =" https://www.google.com/";
	     expected_url = driver.getTitle();
	     System.out.println(expected_url);
	     
	     if (url.contentEquals(expected_url))
	     {
	            System.out.println("Test Passed!");
	     } 
	     else 
	     {
	            System.out.println("Test Failed");
	     }
	       
	        
	        //driver.close();
	       
	    }

	}
