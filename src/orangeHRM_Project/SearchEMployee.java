package orangeHRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEMployee {
	static WebDriver driver ;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 driver  =new ChromeDriver(); 
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  
		 WebElement username = driver.findElement(By.id("txtUsername"));
		 username.sendKeys("Admin");
		 
		 WebElement password = driver.findElement(By.id("txtPassword"));
		 password.sendKeys("admin123");
		 
		 WebElement Login = driver.findElement(By.id("btnLogin"));
		 Login.click();
		 
		 WebElement admin = driver.findElement(By.id("menu_pim_viewPimModule"));
		 admin.click();
		 
		 WebElement config = driver.findElement(By.id("menu_pim_Configuration"));
		 config.click();
		 
		 
	}

}
