package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbCreateAccount
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("https://www.facebook.com/reg/");
		  
		  driver.findElement(By.name("firstname")).sendKeys("Anshu");
		  driver.findElement(By.name("lastname")).sendKeys("Bahi");
		  driver.findElement(By.name("reg_email__")).sendKeys("thechintu.1pk@gmail.com");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("Qwerty@1234");
		  
		  driver.findElement(By.name("birthday_day")).sendKeys("28");
		  driver.findElement(By.name("birthday_month")).sendKeys("May");
		  driver.findElement(By.name("birthday_year")).sendKeys("1995");
	}
	
	

}
