package chrome_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Testing\\AUTOMATION\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		//driver.get("https://accounts.google.com/signin");
		
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?hl=en-GB&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.name("identifier")).sendKeys("Pratikohad@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.navigate().refresh();

	}

}
