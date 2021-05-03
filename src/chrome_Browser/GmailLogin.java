package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Testing\\AUTOMATION\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.name("identifier")).sendKeys("Pratikohad@gmail.com");
		driver.findElement(By.id("identifierNext")).click();

	}

}
