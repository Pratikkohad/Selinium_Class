package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_login {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.id("login-username")).sendKeys("ankit.007@yahoo.com");

		WebElement checkbox =
		driver.findElement(By.xpath("///*[@id=\"persistent\"]"));
	   checkbox.click();
	   
	   boolean abcd = checkbox.isSelected();
		System.out.println(abcd);
		
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("Pratik@1234");
		driver.findElement(By.id("login-signin")).click();
}
}
