package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebool_login 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("https://www.facebook.com/");
		  
		  WebElement username = driver.findElement(By.id("email"));
		  username.sendKeys("ankit.007@yahoo.com");
		  
		  
		  WebElement pass = driver.findElement(By.id("pass"));
		  pass.sendKeys("mydadlove");
		  
		  WebElement Login = driver.findElement(By.name("login"));
		  Login.click();
		  
		  String actualUrl="https://www.facebook.com/"; 
		  String expectedUrl= driver.getCurrentUrl(); 
		  
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) 
		  { 
			  System.out.println("Test passed  :-  "  +actualUrl); 
		 }
		  else
		  { 
			  System.out.println("Test failed" +expectedUrl); 
			  }
//	        if(Login.isDisplayed() && Login.isEnabled())
//	        {
//	            Login.click();
//	            System.out.println(Login);
//	            System.out.println("Successfully logged in");
//	            
//	            String acturl ="https://www.facebook.com/feed";
//	            		
//	        }
//	        else 
//	        {
//	            System.out.println("Element not found");
//	        }

	    }

	}
