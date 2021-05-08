package checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_checkBox_Tickornot
{
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

		WebElement checkbox =
		driver.findElement(By.id("ohrmList_chkSelectRecord_10"));
	  
		//checkbox.click();
		boolean abcd = checkbox.isSelected();
		System.out.println(abcd);
	    if (checkbox.isSelected()) 
	   {
		   System.out.println("Checkbox is ON");
	    }
	   else 
	   {
	        System.out.println("Checkbox is Off");
	    }
	}
	}

