package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		  driver.findElement(By.name("reg_email_confirmation__")).sendKeys("thechintu.1pk@gmail.com");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("Qwerty@1234");
		  
		  driver.findElement(By.name("birthday_day")).sendKeys("28");
		  driver.findElement(By.name("birthday_month")).sendKeys("May");
		  driver.findElement(By.name("birthday_year")).sendKeys("1995");
		  
		 // driver.findElement(By.class("_58mt")).sendKeys("Male");
		//  driver.findElement(By.className("_58mt");
		  
		    Select date = new Select(driver.findElement(By.xpath("id('day')")));
	        date.selectByVisibleText("21");
	        Select month = new Select(driver.findElement(By.xpath("id('month')")));
	        month.selectByVisibleText("Dec");
	        Select year = new Select(driver.findElement(By.xpath("id('year')")));
	        year.selectByVisibleText("1995");
	        
	        
	       // driver.findElement(By.className("_58mt")).click(); //this code is working for female
	       driver.findElement(By.className("_58mt")).click(); //this code is not working for male
	        //driver.findElement(By.id("u_0_5_m1")).click();
	       driver.findElement(By.name("websubmit")).click();;
	}
	
	

}
