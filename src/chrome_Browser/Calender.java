package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification");
		driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@class='ui-datepicker-trigger']")).click();
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).sendKeys("10/02");

		//Thread.sleep(2000);
		
	}

}
