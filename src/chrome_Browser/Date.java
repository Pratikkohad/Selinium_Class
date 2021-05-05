package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		  driver  =new ChromeDriver(); 
		  driver.manage().window().fullscreen();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  
		 WebElement username = driver.findElement(By.id("txtUsername"));
		 username.sendKeys("Admin");
		 
		 WebElement password = driver.findElement(By.id("txtPassword"));
		 password.sendKeys("admin123");
		 
		 WebElement Login = driver.findElement(By.id("btnLogin"));
		 Login.click();
		 
		 WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		 leave.click();
		 
		 WebElement applyleave = driver.findElement(By.id("menu_leave_applyLeave"));
		 applyleave.click();
		 
		 Thread.sleep(1000);
		 WebElement LeaveType = driver.findElement(By.id("applyleave_txtLeaveType"));
		 Select type = new Select(LeaveType);
		 type.selectByIndex(2);
		 
		 Thread.sleep(1000);
		 WebElement dateBox = driver.findElement(By.id("applyleave_txtFromDate"));
		 dateBox.clear();
		 dateBox.sendKeys("2018-01-12");
		 
		 
		 
		 
	}

}
