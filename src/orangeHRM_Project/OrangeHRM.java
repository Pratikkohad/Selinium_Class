package orangeHRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// This code is about to search the user using given Credential which is already in the list
		
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 driver  =new ChromeDriver(); 
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  
		 WebElement username = driver.findElement(By.id("txtUsername"));
		 username.sendKeys("Admin");
		 
		 WebElement password = driver.findElement(By.id("txtPassword"));
		 password.sendKeys("admin123");
		 
		 WebElement Login = driver.findElement(By.id("btnLogin"));
		 Login.click();
		 
		 Thread.sleep(1000);
		 WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		 admin.click();
		 
		 Thread.sleep(1000);
		 WebElement User = driver.findElement(By.id("searchSystemUser_userName"));
		 User.sendKeys("Pratik Kohad");
		 
		 Thread.sleep(1000);
		 //Selecting Drop down Values form web using below method
		 WebElement drp = driver.findElement(By.id("searchSystemUser_userType"));
		 Select dropdown = new Select(drp);
		 dropdown.selectByVisibleText("Admin");
		 
		 Thread.sleep(1000);
		 WebElement Emptyp = driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		 Emptyp.sendKeys("Pratik Kohad");
		 
		 Thread.sleep(1000);
		//Selecting Drop down Values form web using below method using Index Value
		 WebElement Status = driver.findElement(By.id("searchSystemUser_status"));
		 Select statusdrp = new Select(Status);
		 statusdrp.selectByVisibleText("Enabled");
		// statusdrp.selectByIndex(2);
		 
		 Thread.sleep(1000);
		 WebElement search = driver.findElement(By.id("searchBtn"));
		 search.click();
		 

	}

}
