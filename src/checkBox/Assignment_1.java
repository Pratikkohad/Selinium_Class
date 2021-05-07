package checkBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"] "));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("admin123");

		WebElement Login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		Login.click();

		WebElement Admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		Admin.click();

		List<WebElement> selectall = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
		int count = selectall.size();
		System.out.println("Total Number  :-" + count);

		for (WebElement check : selectall)
		{
			for(int i=0;i<selectall.size()	 ;i++)
			{
			check.click();
			i++;
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
