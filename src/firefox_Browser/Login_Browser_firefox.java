package firefox_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login_Browser_firefox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Testing\\AUTOMATION\\geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
         capabilities.setCapability("marionette",true); 
		FirefoxDriver driver = new FirefoxDriver();
		
		String url = " https://www.google.com/";
	    driver.get(url);
	    
	    
	    driver.findElement(By.name("q")).sendKeys("Facebook");
	    
	    //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	      
	    driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).submit();
	   // driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/table/tbody/tr[1]/td[1]/div/h3/a")).click();
	    
	    driver.navigate().to("https://www.facebook.com/login/web/");
	    
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ankit.007@yahoo.com");
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mydadlove");
	    driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).submit();
	    
	    driver.navigate().refresh();
	    
//	    driver.navigate().to("https://www.facebook.com/profile.php?id=100057159113704");
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("Akshat Karwatkar");
	    
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/a")).click();
	    
	    
	    
	    
	    
	    
	    
}
}