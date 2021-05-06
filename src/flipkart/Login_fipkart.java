package flipkart;

import javax.sql.rowset.serial.SerialArray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_fipkart {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/account/login");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"))
				.sendKeys("omkarkankekar@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input"))
				.sendKeys("omkar4456");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[4]/button")).click();
		
		//WebElement search = driver.findElement(By.xpath("//input[@type='text' and @name='q']"));
		driver.findElement(By.className("_2A40On")).click();
//		search.sendKeys("mobile");
//		search.click();
//		

	}

}
