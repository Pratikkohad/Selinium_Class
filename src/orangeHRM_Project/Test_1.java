package orangeHRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_1 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		// HRM Login By Xpath
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 driver  =new ChromeDriver(); 
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		 // USer ID Login 
		 WebElement User = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		 //Thread.sleep(2000);
		 User.clear();
		 
		 //Thread.sleep(2000);
		 User.sendKeys("Admin");
		 // PAssword
		 
		 WebElement pass = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		 //Thread.sleep(2000);
		 pass.clear();
		 
		 //Thread.sleep(2000);
		 pass.sendKeys("admin123");
		 
		 //Login Button
		 
		 WebElement Login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		 Login.submit();
		 
		 WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		 //Thread.sleep(2000);
		 admin.click();
		 
//		 WebElement drp = driver.findElement(By.id("searchSystemUser_userType"));
//		 Select dropdown = new Select(drp);
//		 dropdown.selectByVisibleText("Admin");
		 
		 Select drp = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		 drp.selectByIndex(2);
		 
		 Select drp1 = new Select(driver.findElement(By.id("searchSystemUser_status")));
		 drp1.selectByIndex(2);
		 
		 
		
		 
		  
		  
		
	}

}
