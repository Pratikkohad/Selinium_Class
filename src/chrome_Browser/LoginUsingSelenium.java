package chrome_Browser;

import java.util.Scanner;

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
			  
			  driver.get("https://www.google.com");
			  
			  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("linkedin");
			  //driver.navigate().to("https://www.linkedin.com/login");
			//  driver.get("https://www.linkedin.com/login"); 
			  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
			  WebElement username=driver.findElement(By.id("username")); 
			  WebElement password=driver.findElement(By.id("password")); 
			  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
			 
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
