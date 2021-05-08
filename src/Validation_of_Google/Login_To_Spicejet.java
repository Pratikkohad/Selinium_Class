package Validation_of_Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login_To_Spicejet {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification");
		driver = new ChromeDriver(opt);

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.navigate().to("https://phptravels.com/demo/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/header/div/nav/a[6]")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	}
