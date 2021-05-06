package Learning;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import driver.Chrome_Driver;

public class Login_Uing_ID {
	 static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		// Type 1
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("Admin");
		// type 2
		
		// driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).submit();
		
	}

}
