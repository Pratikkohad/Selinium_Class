package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingSelenium {


		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver(); 
			  driver.manage().window().maximize(); 
			  driver.get("https://www.linkedin.com/login"); 

			  WebElement username=driver.findElement(By.id("username")); 
			  WebElement password=driver.findElement(By.id("password")); 
			  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
			  username.sendKeys("er.pratik28595@gmail.com");
			  password.sendKeys("Pratik@1234"); 
			  login.click();
			  String actualUrl="https://www.linkedin.com/feed/"; 
			  String expectedUrl= driver.getCurrentUrl(); 
			  
			  if(actualUrl.equalsIgnoreCase(expectedUrl)) 
			  { 
				  System.out.println("Test passed  :-  "  +actualUrl); 
			 }
			  else
			  { 
				  System.out.println("Test failed" +expectedUrl); 
				  }
		}
		}
