package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhonePay 
{
	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Testing\\AUTOMATION\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("https://phonepe.freshdesk.com/en/support/login");
		
		//driver.findElement(By.className("gNO89b")).click();
		driver.get("https://phonepe.freshdesk.com/en/support/login");
		
		driver.findElement(By.id("user_session_email")).sendKeys("Pratikkohad98@gmail");
		driver.findElement(By.id("user_session_password")).sendKeys("1432");
		driver.findElement(By.className("controls")).click();
		
		

	}

}
