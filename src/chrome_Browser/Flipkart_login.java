package chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_login 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.google.com/");
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//		
//		driver.findElement(By.name("email")).sendKeys("pratikkohad98@gmail.com");
//		driver.findElement(By.id("continue")).click();
//		
//		driver.findElement(By.name("password")).sendKeys("Pratik1234");
//		driver.findElement(By.id("signInSubmit")).click();
		
		driver.get("https://www.flipkart.com/account/login");
		//driver.findElement(By.className("_1fqY3P")).sendKeys("Pratikohad@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("sanketkohad98@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input")).sendKeys("sanket1234");
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[4]/button")).click();
	}

}
