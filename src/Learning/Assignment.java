package Learning;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{
	static WebDriver driver;
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).submit();
		
		String  actualMassege=driver.findElement(By.id("spanMessage")).getText();
		//actualMassege.getText();
		System.out.println(actualMassege);
//		
//		String Expected_1 ="Username cannot be empty";
//		String Expected_2 ="Password cannot be empty";
//		
//		if (Expected_1.equals(actualMassege)) 
//		{
//			System.out.println(actualMassege);
//		}
//		else 
//		{
//			System.out.println("Wrong");
//		}
//		
	}

}
