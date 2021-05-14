package action_handler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Handler {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"] "));
		Actions name = new Actions(driver);
		Thread.sleep(2000);
		name.moveToElement(username).perform();
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("admin123");

		WebElement Login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
//		Actions log = new Actions(driver);
//		log.moveToElement(Login).click();
//	
}
}
